package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        /*
        주민등록번호에서 생년월일,성별까지만 출력하는 프로그램 작성
        -주민번호는 13자리 숫자
        앞자리6자리:생년월이, 뒷번호중 1번째 숫자는 성별
        입력 데이터 -포함한 14자리 문자열
        ="901231-1234567"경우 901231-1까지 출력
        ="030708-4567890"경우 030708-4까지 출력
         */

        String num="901231-1234567";
        System.out.println(num.substring(0, 8));
        String num2="030708-4567890";
        System.out.println(num2.substring(0, num2.indexOf("-")+2));
    }
}
