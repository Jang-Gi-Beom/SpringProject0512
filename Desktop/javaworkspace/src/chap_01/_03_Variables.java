package chap_01;

public class _03_Variables {
    public static void main(String[] args) {

        String name="배송";
        int hour=15;
        System.out.println(name +" 시작"+hour+"시에 방문 예정");
        System.out.println(name +" 완료");
        
        double score=90.5;
        char grade='A';
        name="강백호";
        System.out.println(name+"님의 평균 점수는 "+score+"점 이다");
        System.out.println("학점은 "+grade+"이다");

        boolean pass=true;
        System.out.println("이번 시험 합격했나?"+pass);

        double d=3.123456789;//정밀소수
        float f=3.123456789F;//실수값F
        System.out.println(d);
        System.out.println(f);

        long l=1000000000000L;//long형 자료
        l=1_000_000_000_000L; //위와 같음
        System.out.println(l);
        //int long float double char String boolean ->데이터 범위에 맞는 자료형 사용하기

    }
}
