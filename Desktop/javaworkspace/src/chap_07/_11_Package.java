package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        //패키지 : 연관된 클래스끼리 묶어둔 것
        //      : 패키지 안에 클래스 만들면 맨위에 작성된다
        //다른 패키지에 있는 클래스를 사용하겠다면 -> import 해야함

        //랜덤 클래스
        Random random = new Random();
        System.out.println("랜덤 점수 : "+ random.nextInt());//int 범위내 정수값 반환
        System.out.println("랜덤 정수(범위)"+random.nextInt(10));//0이상 10미만
        System.out.println("랜덤 실수"+random.nextInt());//0.0이상 1.0미만
        //System.out.println("랜덤 실수(범위)"+random.nextInt());//범위 지정 불가

        //만약 5.0이상 10.0미만 실수를 뽑으려면?
        double min=5.0;
        double max=10.0;              //((10-5)*랜덤실수범위)->0.0이상 5.0미만 + ->5.0이상 10.0미만
        System.out.println("랜덤 실수(범위)"+(min+(max-min)* random.nextDouble()));

        System.out.println("랜덤 boolean : "+ random.nextBoolean()); //true false

        //로또 번호 랜덤 뽑으려면? 1~45?
        System.out.println("로또 번호 : "+ (random.nextInt(45)+1));
        //nextInt(45): 0미만 45미만

        //Math, Scanner, (문자열)-StingBuilder, StringBuffer, StringTokenizer
        //(큰수)-BigInteger, (오차없이)-BigDecimal
        //(날짜)-LocalDate, LocalTime, LocalDateTime, DateTimeFormatter......


    }
}
