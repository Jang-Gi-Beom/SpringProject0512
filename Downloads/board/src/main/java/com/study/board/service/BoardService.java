package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    // new 를 써야하지만 스프링부트가 알아서 읽어와서 주입을 해준다.
    private BoardRepository boardRepository;

    // 글 작성 처리
    public void  write(Board board) {


        boardRepository.save(board);
    }

    // 게시글 리스트 처리
    public Page<Board> boardList(Pageable pageable) {

       return boardRepository.findAll(pageable);
       /* findAll 이라는 메소드를 통해 DB에 있는 모든 정보들을 가져오게되고
          Pageable 이라는 클래스를 넘겨주게되면 그 안에 페이지가 몇 페이지인지
          그리고 한페이지에 보여줄 게시글이 몇 개인지를 담아서 보내줄 수가 있다/
        */
    }

    public Page<Board> boardSearchList(String searchKeyword, Pageable pageable) {
        return boardRepository.findByTitleContaining(searchKeyword,pageable);
    }

    // 특정 게시글 불러오기
    public Board boardView(Integer id) {

        return boardRepository.findById(id).get();
        //  findById : 매개변수에 해당하는 값을 토대로 DB에서 값을 조회해오는 역할을 수행
    }

    // 특정 게시글 삭제
    public void boardDelete(Integer id) {

        boardRepository.deleteById(id);
        // 매개변수로 넘어 온 id을 이용해서 해당 데이터 삭제
    }

}
