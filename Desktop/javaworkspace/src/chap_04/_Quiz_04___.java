package chap_04;

public class _Quiz_04___ {
    public static void main(String[] args) {
        //조건문 활용하여 주차 요금 정산 프로그램 작성
        //주차요금 시간당 4000원(일일 최대 요금 30000원)
        //경차 또는 장애인 차량 최종 요금애서 50% 할인

        /*
        일반 차량 5시간 주차시 20000원
        경차 5시간 주차시 10000원
        장애인 차량 10시간 주차시 15000원
        -> 주차요금은 00원 입니다
        */
        int hour=10;
        int max=30000;
        boolean isSmallCar=false;
        boolean disabledPerson=true;
        
        int fee=hour*4000; //5시간당 4000원

        if(fee>30000){ //30000원 초과시 일일 최대 요금으로 수정
            fee=30000;
        }
        if(isSmallCar || disabledPerson){ //50% 할인 적용
            fee/=2;
        }
        System.out.println("주차 요금은 "+ fee+"입니다");
    }
}
