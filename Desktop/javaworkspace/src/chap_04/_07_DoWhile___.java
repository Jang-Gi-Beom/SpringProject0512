package chap_04;

public class _07_DoWhile___ {
    public static void main(String[] args) {
        //반복문 DOWhile
        int distance=25;//전체 거리
        int move=0;//현재 거리
        int height=2;//키
        while(height+move<distance){
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동거리"+move);
            move+=3;//3m 이동
        }
        System.out.println("도착했습니다");
        System.out.println("---반복문#1----");

        //키가 엄청 큰 사람?->첨부터 false여서 while문 들어가지 않음
        move=0;
        height=25;
        //수행x
        while(height+move<distance){
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동거리"+move);
            move+=3;//3m 이동
        }
        System.out.println("도착했습니다");
        System.out.println("---반복문#2----");
        
        //do while 반복문 :1번 수행
        do{
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동거리"+move);
            move+=3;//3m 이동
        }while (move+height<distance);
        System.out.println("도착했습니다");
        System.out.println("---반복문#3----");

        move=0;//현재 거리
        height=2;//키
        do{
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동거리"+move);
            move+=3;//3m 이동
        }while (move+height<distance);
        System.out.println("도착했습니다");
        System.out.println("---반복문#4----");


    }
}
