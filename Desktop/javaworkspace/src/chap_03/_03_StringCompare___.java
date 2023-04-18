package chap_03;

public class _03_StringCompare___ {
    public static void main(String[] args) {
        //문자열 비교
        String s1="Java";
        String s2="Python";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Java")); //대소문자 구분o
        System.out.println(s1.equalsIgnoreCase("java"));//대소문자 구분x 문자열 같은지

        //문자열 비교 심화
        s1="1234"; //s1과 s2가 "1234"참조 ex:s1과 s2는 메모지가 같음
        s2="1234"; //->하나만 참조해서
        System.out.println(s1.equals(s2)); //true(내용)
        System.out.println(s1 ==s2); //true(참조)

        s1=new String("1234"); //s1과 s2는 메모지가 다름
        s2=new String("1234");
        System.out.println(s1.equals(s2)); //true(내용)
        System.out.println(s1 ==s2); //false(참조)
    }
}
