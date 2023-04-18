package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue
        //치킨 주문 손님중 노쇼 손님 있다고 가정

        //for
        int max=20; //최대 치킨 판매 수량
        int sold=0;//현재 치킨 판매 수량
        int noShow=17;//노쇼 고객 번호

        for (int i = 1; i <= 50; i++) {
            System.out.println(i+"번 손님 치킨 나옴");
            if(i==noShow){
                System.out.println(i+"번 손님 노쇼로 다음 손님 기회 넘어간다");
                continue; //continue 다음 처음으로
            }
            sold++; //판매처리
            if(sold==max){
                System.out.println("금일 재료 소진");
                break;
            }
        }
        System.out.println("영업 종료");
        System.out.println("-------------------------------");
        //whlie문
        sold=0;
        int index=0;//손님번호
        //while(index<=50){ //break 가 있어서 무한루프x 조건 없어도 된다
        while(true){
            index++;
            System.out.println(index+"손님 치킨 나옴");
            if(index==noShow){
                System.out.println(index+"손님 노쇼로 다음 손님께 넘어감");
                continue;
            }
            sold++;
            if(sold==max){
                System.out.println("금일 재료 소진");
                break;
            }
        }
        System.out.println("영업 종료");
    }
}
