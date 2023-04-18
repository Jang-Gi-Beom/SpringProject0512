package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
      /*  변수 이름 :
        어울림
        밑줄,문자,숫자 가능
        공백x
        밑줄,숫자 시작 가능
        1단어 또는 2단어이상 연속
        시작-소문자, 각단어첫글자-대문자(첫글자빼고)
        예약어x
        */
        String nationality="대한민국"; //나라
        String firstName="은주"; //이름
        String lastName="김";//성
        String date0fBirth="2001-12-31"; //생년월일
        String residentialAddress="무슨 호텔"; //체류지
        String purpose0fVisit="관광"; //입국목적
        String flightNo="KE657";//항공 편명
        String _flightNo="KE657";//밑줄시작
        String flight_no_2="KE657";//밑줄+숫자
        //String -flightNo="ke657";

        //프로그램 흐름 위해 사용(이름 중요x)
        int i=0;
        String s="";
        String str="";

        //절대 변하지 않는 상수->대문자
        final String CODE="KR";

    }
}
