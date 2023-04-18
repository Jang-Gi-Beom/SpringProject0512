package chap_02;

public class _Quize_02 {
    public static void main(String[] args) {
        /*
        어린이키에 따른 놀이기구 탑승 가능 여부 확인 프로그램 작성
        (키:120cm이상 경우만, 삼항 연산자 이용
        결과:키가 115cm 이므로 불가
            키가 121cm 이므로 가능
        */
        int height1=115;
        int height2=121;

        String s1= (height1>=120)?"탑승 가능합니다":"탑승 불가능합니다";
        System.out.println("키가 "+height1+"cm 이므로 "+s1);
        String s2=(height2>=120)?"탑승 가능합니다":"탑승 불가능합니다";
        System.out.println("키가 "+height2+"cm 이므로 "+s2);


    }
}
