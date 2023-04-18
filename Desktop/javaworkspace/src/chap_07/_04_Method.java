package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName="까망이";

        b1.autoReport(); //지원x ->전달/반환값이 없는 메소드
        BlackBox.canAutoReport=true;
        b1.autoReport(); //지원o ->전달값이 있는 메소드

        b1.insertMemoryCard(256);

        //일반 영상 :1(type)
        //이벤트 영상(충돌) :2
        //->전달/반환값이 있는 메소드
        int fileCount= b1.getVideoFileCount(1);//일반
        System.out.println("일반 영상 파일수"+fileCount+"개");

        fileCount= b1.getVideoFileCount(2);//이벤트
        System.out.println("이벤트 영상 파일수"+fileCount+"개");
    }
}
