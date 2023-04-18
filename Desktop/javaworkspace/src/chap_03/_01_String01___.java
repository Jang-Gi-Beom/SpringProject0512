package chap_03;

public class _01_String01___ {
    public static void main(String[] args) {
        String s= "I like Java and Python and C.";
        System.out.println(s);

        //문자열 길이
        System.out.println(s.length()); //29
        //대소문자 변환
        System.out.println(s.toUpperCase()); //대문자
        System.out.println(s.toLowerCase()); //소문자
        //포함관계
        System.out.println(s.contains("Java"));//특정글자 포함여부 true false
        System.out.println(s.indexOf("Java"));//특정글자 글자위치 정보(0~) 7
        System.out.println(s.indexOf("C#"));//미포함: -1
        System.out.println(s.indexOf("and")); //처음 위치
        System.out.println(s.lastIndexOf("and")); //마지막 위치
        System.out.println(s.startsWith("I like")); //이 문자열로 시작시 true/false
        System.out.println(s.endsWith("."));//이 문자열 마지막시 true/false
    }
}
