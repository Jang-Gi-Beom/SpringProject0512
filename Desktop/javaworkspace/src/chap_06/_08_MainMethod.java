package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) { //->메인 메소드(처음 진입, 리턴값X, args라는 스프링배열이 넘어오게 된것
        //Edit Configurations..
        for (String s: args) {
            System.out.println(s);
        }
        //1.도서 조회
        //2.도서 대출
        //3.도서 반납
        if(args.length==2){
            switch (args[0]){
                case "1":
                    System.out.println("도서 조회 메뉴");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴");
                    break;
                default:
                    System.out.println("잘못 입력");
            }
        }else {
            System.out.println("사용법 1~3 메뉴중 하나를 선택하세요");
        }
    }
}
