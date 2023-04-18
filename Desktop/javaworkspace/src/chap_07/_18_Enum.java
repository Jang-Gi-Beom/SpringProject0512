package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        //열거형 : 상수들의 묶음
        //달력 : JAN, FEB, MAR...
        //사이즈 : S, M, L, XL...
        //해상도 : HD, FHD, UHD...

        //열거형 만들기
        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        //값 변경
        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.print("동영상 녹화 품질 : ");
        switch (resolution){
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }
        //읽은 값을 열거형으로 바꾸기
        resolution = Resolution.valueOf("UHD"); //문자열로부터 값을 가져와서 열거형으로 바꿔준다
        System.out.println(resolution);

        System.out.println("==================");
        for (Resolution myRes : Resolution.values() ){ // values : 값을 하나씩 읽어줌
            System.out.println(myRes.name()+":"+myRes.ordinal());//ordinal : 열거형 상수가 정의된 순서
        }
        System.out.println("======================");
        for (Resolution myRes : Resolution.values() ){
            System.out.println(myRes.name()+":"+myRes.getWidth());//getWidth를 통해 상수 진짜 값을 가져올 수 있음
        }

    }
}
enum Resolution{
    HD(1280), FHD(1920), UHD(3840);

    //상수가 내포하고 있는 값이 필요할 때
    private final int width; //변수 지정
    Resolution(int width){  //값 정의
        this.width=width;
    }
    public int getWidth(){
        return width;
    }
}
