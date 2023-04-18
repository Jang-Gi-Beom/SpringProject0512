package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이스(Escape Sequence, Escape Character, Special Character
        //\n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요");
        System.out.println("자바가\t너무\t재밌어요");
        System.out.println("자바가\"너무\"재밌어요");
        System.out.println("자바가\'너무\'재밌어요");
        System.out.println("c:\\Program Files\\Java");
        System.out.println("'뭘봐'");
        System.out.println("\'뭘봐\'");

        char c='A';
        c='\'';
        System.out.println(c);

    }
}
