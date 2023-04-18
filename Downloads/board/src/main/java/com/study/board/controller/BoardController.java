package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")
    // localhost:8090/board/write로 요청이 들어오면
    public String boardWriteForm() {

        return "boardwrite";
        // boardwrite.html 페이지로 이동시킴
    }

    @PostMapping("/board/writepro")
    // form 액션태그에서 적어 넣은 것과 같게 적어야 함
    public String boardWritePro(Board board, Model model){

        boardService.write(board);

        model.addAttribute("message","글 작성이 완료되었습니다.");
        model.addAttribute("searchUrl","/board/list");

        return "message";
    }

    @GetMapping("/board/list")
    public String boardList(Model model, @PageableDefault(page = 0, size = 10, sort = "id",
            direction = Sort.Direction.DESC) Pageable pageable , String searchKeyword) {
        //page : default페이지, size : 한 페이지 게시글수, sort: 정렬기준컬럼, direction : 정렬순서
        // Pageable -> domain 으로 선택해야 함

        Page<Board> list = null;

        if (searchKeyword == null) {
            list = boardService.boardList(pageable);
            // 검색키워드가 없을 때 : 기존의 리스트를 보여줌
        } else {
            list = boardService.boardSearchList(searchKeyword,pageable);
            // 검색키워드가 있으면 검색 리스트 반환
        }

        /*
            필요한 변수
            nowPage → 현재페이지
            startPage → 블럭에서 보여줄 시작 페이지
            endPage →  블럭에서 보여줄 마지막 페이지
         */
        int nowPage = list.getPageable().getPageNumber() + 1;
        // pageable에서 넘어온 현재 페이지를 가지고 올 수 있다. 0부터 시작이니깐 +1 해줌
        int startPage = Math.max(nowPage - 4, 1);
        // Math.max -> 매개변수로 들어온 두 값을 비교해서 큰 값을 반환 ( 현재페이지가 1일때 -3이면 안되니깐)
        int endPage = Math.min(nowPage + 5, list.getTotalPages());
        // 마지막 페이지를 초과하면 안되니까 Math.min 으로 처리

        model.addAttribute("list", list);
        // boardService에 있는 boardList 메소드 반환값을 "list"이라는 이름에 저장해서 boardlist.html로 넘김
        model.addAttribute("nowPage",nowPage);
        model.addAttribute("startPage",startPage);
        model.addAttribute("endPage",endPage);
        return "boardlist";
    }

    @GetMapping("/board/view")
    public String boardview(Model model,Integer id) {
        model.addAttribute("board",boardService.boardView(id));
        return "boardview";
    }

    @GetMapping("/board/delete")
    public String boardDelete(Integer id, Model model) {
        boardService.boardDelete(id);
        model.addAttribute("message","글 삭제가 완료되었습니다.");
        model.addAttribute("searchUrl","/board/list");
        return "message";
        // 게시글 삭제 후 다시 boardlist 페이지로 이동

    }

    @GetMapping("/board/modify/{id}")
    //PathVariable이라는 것은 modify 뒤에있는 {id}부분이 인식이되서 Integer형태의 id로 들어온다는것
    public String boardModify(@PathVariable("id") Integer id,Model model) {

        model.addAttribute("board", boardService.boardView(id));
        // 기존에 있던 자료를 가져와서 return 해줌
        return "boardmodify";
    }


    @PostMapping("/board/update/{id}")
    public String boardUpdate(@PathVariable("id") Integer id, Board board) {

        Board boardTemp = boardService.boardView(id);
        // 기존에 있던 글을 담아 옴

        boardTemp.setTitle(board.getTitle());
        boardTemp.setContent(board.getContent());
        // 기존에 있던 내용을 새로운 내용으로 바꿈
        boardService.write(boardTemp);

        return "message";
    }
}
