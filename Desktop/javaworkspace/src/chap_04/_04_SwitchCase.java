package chap_04;

import java.lang.invoke.SwitchPoint;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //SwitchCase
        /*
        석차에 따른 장학급 지금
        1등:전액   2등:반액   3등:반액   그외 대상 아님
        */
        //if else 문 이용
        int ranking=4; //등수
        if(ranking==1){
            System.out.println("전액");
        }else if(ranking==2 || ranking==3){
            System.out.println("반액");
        }else{
            System.out.println("대상아님");
        }
        System.out.println("조회완료#1");

        //Switch Case 이용(명확한 케이스가 있는 경우)
        ranking=2;
        switch (ranking){
            case 1:
                System.out.println("전액");
                break;
            case 2: //ranking 2와 3 통합
            case 3:
                System.out.println("반액");
                break;
            default:
                System.out.println("대상 아님");
        }
        System.out.println("조회완료#2");

        //중고상품 등급 따른 가격 책성(1급:최상, 4급:최하)
        int grade=4;//등급
        int price=7000;
        switch(grade){
            case 1:
                price+=1000;
            case 2:
                price+=1000;
            case 3:
                price+=1000;
                break;
        }//1급:10000원, 2급:9000원, 3급:8000원; 4급:7000원
        System.out.println(grade+"등급 제품 가격: "+ price+"원");

    }
}
