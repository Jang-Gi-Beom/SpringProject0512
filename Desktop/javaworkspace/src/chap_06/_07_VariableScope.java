package chap_06;

public class _07_VariableScope {//변수의 범위 : 변수가 선언된 {} 안에서만 사용 가능==지역변수 ->사용하려면 전달값이용하여 쓰기
    public static void methodA(){
       // System.out.println(number);
    }
    public static void methodB(){
        int result=1;//지역변수
    }

    public static void main(String[] args) {
        
        int number=3; //메인 영역 메소드는 메인내에서만
       // System.out.println(result);//methodB에서만 사용해야함
        
    }
}
