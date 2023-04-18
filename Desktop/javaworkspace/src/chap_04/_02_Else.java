package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        //조건문 If Else
        int hour=15;
        //오후2시 이전:아메리카노, 그 외:디카페인
        if(hour<14){
            System.out.println("아메리카노 +1");
        }else{
            System.out.println("디카페인 +1");
        }
        System.out.println("커피주문 완료#1");


        //오후2시이후이거나 모닝커피 마신 경우
        int hour1=15;
        boolean morningCoffee=true;
        if(hour1>14 || morningCoffee){
            System.out.println("디카페인 +1");
        }else{
            System.out.println("아메리카노 +1");
        }
        System.out.println("커피주문 완료#2");
    }
}
