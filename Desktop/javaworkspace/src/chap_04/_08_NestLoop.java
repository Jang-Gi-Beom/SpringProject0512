package chap_04;

public class _08_NestLoop {
    public static void main(String[] args) {
        //이중 반복문
        //*로 사각형 만들기
        /*
        *****
        *****
        *****
        *****
        *****
         */
        for (int i = 0; i < 5; i++) {
            /*System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");*/
            System.out.print("*");
           for (int j = 0; j < 5; j++) {
               System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----이중반복문#1-----");
        //*왼쪽 삼각형만들기
        /*
        *
        **
        ***
        ****
        *****
         */
        for (int i = 0; i < 5; i++) {
            //for (int j = 0; j < i+1; j++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----이중반복문#2-----");
        //*오른쪽 삼각형만들기
        /*
             *
            **
           ***
          ****
         *****
         */
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) { //4는 *자리 빼고 :공백
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) { //:별
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----이중반복문#3-----");
    }
}
