package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //반복문 for
        //나코 매장
        System.out.println("어서오세요 나코입니다");
        //손님이 또 들어오면?
        System.out.println("어서오세요 나코입니다");
        //인사법이 바뀌면?
        System.out.println("환영합니다 나코입니다");
        //가게 이름이 바꾸면?
        System.out.println("환영합니다 코나입니다");

        System.out.println("-----반복문 사용-----");
        //반복문 사용 For
        //(선언; 조건; 증감)
        for(int i=0; i<10; i++){
            System.out.println("어오세요 나코입니다"+i);
        }
        System.out.println("환영합니다 나코입니다");

        //짝수만 출력 (fori만 적고 엔터)
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i);
        }
        System.out.println();
        //홀수만
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i);
        }
        System.out.println();
        //거꾸로
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();
        //1~10까지 수들의 합
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            sum+=i;
            System.out.println("현재까지 총합"+sum+"이다");
        }
        System.out.println("1~10 수들의 합은"+ sum+"이다");
    }
}
