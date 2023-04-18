package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        //아스키코드(ASCII) : 미국 표준 코드
        //대문자 65~,  소문자 97~,    숫자 48~
        char c='A';
        System.out.println(c);//A
        System.out.println((int)c); //65

        c='B';
        System.out.println(c);//B
        System.out.println((int)c); //66

        c++;
        System.out.println(c);//C
        System.out.println((int)c); //67

        c='1';
        System.out.println(c);//1
        System.out.println((int)c); //49
        
        //10*15에 해당되는 영화관 좌석
        String[][] seats3=new String[10][15];
        char ch='A';
        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) { //가로
                seats3[i][j]=String.valueOf(ch)+(j+1); //ch 문자->문자열
            }
            ch++;
        }

        //영화관 좌석 번호
        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) { //가로
                System.out.print(seats3[i][j]+" ");
            }
            System.out.println();
        }


    }
}
