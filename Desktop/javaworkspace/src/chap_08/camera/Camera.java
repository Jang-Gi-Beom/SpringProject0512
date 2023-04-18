package chap_08.camera;

public abstract class Camera { //(부모) abstract : 직접 객체를 생성 못하게 함
    public void takePicture(){
        System.out.println("사진을 촬영합니다");
    }
    public void recordVideo(){
        System.out.println("동영상을 녹화합니다");
    }

    public abstract void showMainFeature(); //추상 클래스 : 메소드 선언만 한다 {}없음
    //구현해야 하는 메소드
}
