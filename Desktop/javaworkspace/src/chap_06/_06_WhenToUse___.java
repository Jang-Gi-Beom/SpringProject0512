package chap_06;

public class _06_WhenToUse___ {
    public static int getPower(int number){ //number의 제곱
//        int result = number*number;
//        return  result;
        return getPower(number, 2);
        //밑에 메소드 가져와서 이용 가능
        //=>메소드 내에서 메소드 사용o
    }
    public static int getPower(int number, int exponent){
        int result=1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return  result;
    }

    public static void main(String[] args) {
        //메소드 필요한 이유

        //2의 2승 구하기->4
       /* int result=1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);*/
        System.out.println(getPower(2,2));

        //3의 3승 구하기->27
        System.out.println(getPower(3,3));

        //4의 2승 구하기->16
        /*result=1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result);*/
        System.out.println(getPower(4,2));

    }
}
