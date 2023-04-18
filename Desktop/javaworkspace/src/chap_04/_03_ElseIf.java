package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 ElseIf
        /*
        한라봉에이드가 있으면 +1
        또는 망고주수가 있으면 +1
        또는 아이스아메리카노 +1
        */
        boolean hallabongAde= true;
        boolean mangoJuice=true;

        if(hallabongAde){
            System.out.println("한라봉에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        }else {
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("커피주문 완료#1");

        hallabongAde= false;
        mangoJuice=false;
        boolean orangeJuice=true;

        if(hallabongAde){
            System.out.println("한라봉에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        }else if(orangeJuice){
            System.out.println("오렌지주스 +1");
        } else {
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("커피주문 완료#2");

        //else 없어도 된다
        orangeJuice=false;
        if(hallabongAde){
            System.out.println("한라봉에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        }else if(orangeJuice){
            System.out.println("오렌지주스 +1");
        }
        System.out.println("커피주문 완료#3");

    }
}
