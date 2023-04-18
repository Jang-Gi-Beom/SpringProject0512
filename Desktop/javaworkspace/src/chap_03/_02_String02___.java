package chap_03;

public class _02_String02___ {
    public static void main(String[] args) {
        
        String s= "I like Java and Python and C.";
        //문자열 변환
        System.out.println(s.replace(" and",","));//" and"를 ","로 변환
        //시작과 끝위치 지정
        System.out.println(s.substring(7));//인덱스 7번부터 시작(이전내용 삭제)
        System.out.println(s.substring(s.indexOf("Java"))); // Java 부터 시작
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));//시작위치 부터 끝위치 "직전"까지
        //공백제거
        s="        I lov Java.       ";
        System.out.println(s);
        System.out.println(s.trim());//앞뒤 공백 제거

        //문자열 결합
        String s1="Java";
        String s2="Python";
        System.out.println(s1+s2);//JavaPython
        System.out.println(s1+","+s2); //Java,Python
        System.out.println(s1.concat(",").concat(s2)); //문자열 결합 : Java,Python
    }
}
