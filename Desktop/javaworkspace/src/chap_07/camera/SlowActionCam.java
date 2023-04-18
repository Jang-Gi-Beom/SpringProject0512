package chap_07.camera;

public class SlowActionCam /*extends ActionCam*/{  //ActionCam final class로 작성되어 상속 불가
    
    public String name; //상속불가로 재 작성
    public SlowActionCam() {
        this.name="슬로우 액션 카메라";
    }
    //ActionCam 에서 final 작성하여서 오버라이딩 불가
//    public void makeVideo(){
//        System.out.println(this.name+" : "+this.lens+"로 촬영한 슬로우 비디오를 제작합니다");
//    }
    public void makeVideo(){
        System.out.println("자체 개발한 비디오 제작 기능");
    }
    
}
