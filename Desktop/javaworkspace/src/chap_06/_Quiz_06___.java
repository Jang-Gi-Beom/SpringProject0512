package chap_06;

public class _Quiz_06___ {
    public static String getHiddenData(String data, int index){
        String hiddenData= data.substring(0,index); //->'나'
        //for(int i=index; i<data.length(); i++){
        for (int i = 0; i < data.length()-index; i++) { //*** 숫자를 빼는 게 아니라 해당 위치인덱스가 빼짐
            hiddenData+="*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        /*
        개인 정보 중 일부 비공개로 전환
        증명서          ->     증명서
        나코딩                 나**
        990130-1234567       990130-1******
        010-1234-5678       010-1234-****
        
        -개인정보를 비공개로 전환하는 메소드 작성
        -하나의 메소드에서 모든 동작처리
        -*위치 비공개 적용
        
        substring() 문자열 일부 자를 수 있음
        length() 문자열 길이 알 수 있음
         */
        String name="나코딩";
        String id="990130-1234567";
        String phone="010-1234-5678";

        System.out.println("이름 : "+getHiddenData(name,1)); //개인정보, 비공개 시작 위치
        System.out.println("주민번호 : "+getHiddenData(id,8));
        System.out.println("전화번호 : "+getHiddenData(phone,9));
    }
}
