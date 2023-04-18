package chap_01;

public class _Quize_01 {
    public static void main(String[] args) {
        //버스 도착 정보 출력하는 프로그램 작성(각 정보 적절한 자료형 변수 정의)
        //버스번호:"1234", "상암08"
        //남은 시간 분단위(3분, 5분)
        //남은 시간 km단위(1.5km, 0.8km)

        /*(실행 결과)
        상암08번 버스
        약 3분 후 도착
        남은 거리 1.2km
        */
        String busNum="상암08";
        int minute=3;
        double distance=1.2;

        System.out.println(busNum+"번 버스");
        System.out.println("약 "+minute+"분 후 도착");
        System.out.println("남은 거리 "+distance+"km");

    }
}
