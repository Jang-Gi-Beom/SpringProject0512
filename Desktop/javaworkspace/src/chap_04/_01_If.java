package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //제어문 중 조건문
        int hour=15;
        if(hour < 14) {
            System.out.println("아이스아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피주문 완료#1");

        //오후 2시 이전이며 모닝커피 안마셨을 경우
        hour=10;
        boolean morningCoffe=false;
        //if(hour<14&& morningCoffe==false){ //이줄==밑줄
        if(hour<14&& !morningCoffe){
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("커피주문 완료#2");


        //오후 2시이후거나 모닝 커피 마신 경우
        hour=15;
        morningCoffe=false; //true도 가능
        //if(hour>=14 || morningCoffe==true){
        if(hour>=14 || morningCoffe){
            System.out.println("디카페인 커피 +1");
        }
        System.out.println("커피주문 완료#3");
    }
}
