package chap_04;

public class _06_While___ {
    public static void main(String[] args) {
        //반복문 while
        //수영장에서 수영하는 모습
        int distance=25;//전체이동거리 25m
        int move=0;//현재이동거리 0m
        while(move<distance){ //현재 이동거리가 전체거리보다 작다는 조건이 참인 동안 반복수행
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재이동거리"+move);
            move+=3; //3m이동 //이문장이 없으면:무한 루프
        }
        System.out.println("도착하였습니다");
    }
}
