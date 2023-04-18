package chap_06;

public class _05_OverLoading___ {
    public static int getPower(int number){
        int result = number*number;
        return  result;
    }
    public static int getPower(String strNumber){
        int number=Integer.parseInt(strNumber);//문자열->정수값으로 뽑기
        return number*number;
    }
    public static int getPower(int number, int exponent){
        int result=1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름 메소드 여러번 선언 가능
        //1. 전달값 자료형 다르거나(반환형이 다르면 중복 정의xx)
        //2. 전달값 개수 다르거나
        System.out.println(getPower(3));//3*3=9 (정수)
        System.out.println(getPower("4"));//4*4=16 (문자열)

        System.out.println(getPower(3,3)); //27

    }
}
