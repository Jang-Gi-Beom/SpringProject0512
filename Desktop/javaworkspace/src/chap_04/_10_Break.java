package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        //Break
        //치킨집 20마리만 판매, 1인당 1마리 구매 가능
        //손님 50명 대기
        
        //for문
        int max=20;
        for (int i = 1; i <=50; i++) {
            System.out.println(i+"번 손님 주문 치킨 나옴");
            if(i==max){
                System.out.println("금일 재료 소진");
                break; //반복문 탈출
            }
            System.out.println("영업 종료");
        }
        System.out.println("====================");

        //while
        int index=1;//손님번호
        while(index<=50){
            System.out.println(index+"손님 주문한 치킨 나옴");
            if(index == max){
                System.out.println("금일 재료 소진");
                break;
            }
            index++;
        }
        System.out.println("영업 종료");



    }
}
