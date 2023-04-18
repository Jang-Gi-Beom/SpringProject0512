package chap_02;

public class _01_Operator01 {
    public static void main(String[] args) {
        //산술연산자

        //일반 연산
        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);

        System.out.println(5/2);
        System.out.println(2/4);//정수연산-소수버려짐
        //나머지 연산
        System.out.println(4%2);//0
        System.out.println(5%2);//1
        //우선순위 연산
        System.out.println(2+2*2);//6
        System.out.println((2+2)*2);//괄호사용하여 우선순위 변경가능
        //변수 연산

        //증감연산++ --
        int val;
        val=10;
        System.out.println(val);
        System.out.println(val++);//연산 수행 후 ++
        System.out.println(++val); //++하고 연산

        //은행 대기번호 표
        int waiting=0;
        System.out.println("대기인원"+waiting++);
        System.out.println("대기인원"+waiting++);
        System.out.println("대기인원"+waiting++);
        System.out.println("총대기인원"+waiting);

    }
}
