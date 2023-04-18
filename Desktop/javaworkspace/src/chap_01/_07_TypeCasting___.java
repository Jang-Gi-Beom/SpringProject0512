package chap_01;

public class _07_TypeCasting___ {
    public static void main(String[] args) {
        //형변환: 정수형<->실수형

        //int to float, double
        int score=93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double) score);

        //float,double to int
        float score_f=93.3F;
        double score_d=98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        //정수+실수
        score =93+(int)98.8;
        score_d=93+98.8;//(double)93 생략가능

        double convertedScoreDouble=score; //191->191.0
        //int->long->float->double(자동변환)
        //큰범위->작은 범위로 변환 : (자료형)작성 필요->수동변환
        
        //숫자->문자
        //정수
        String s1=String.valueOf(93);//방법1 String 클래스가 제공해주는 valueOf를 통해 숫자->문자열로 변환
        s1=Integer.toString(93);//방법2
        System.out.println(s1);
        //실수형
        String s2=String.valueOf(98.8);
        s2=Double.toString(98.8);
        System.out.println(s2);

        //문자->숫자
        //정수
        int i=Integer.parseInt("93"); //파싱한다
        System.out.println(i);
        //실수
        double d= Double.parseDouble("98.8");
        System.out.println(d);
        
        //잘못 : int error=Integer.parseInt("자바");

    }
}
