package chap_07.camera;

//FoctoryCam is a Camera(Is-A)이즈어 관계
public class FactoryCam extends Camera{ //자식 클래스
    public FactoryCam() {
        //this.name="공장 카메라";
        super("공장카메라"); //부모클래스의 Camera 의 메소드 protected Camera(String name)생성자 호출
    }
    public void detectFire(){
        //화재 감지
        System.out.println("화재를 감지합니다");
    }

    public void recordVideo(){
       super.recordVideo(); //부모클래스에 있는 recordVideo()메소드를 실행하고
        detectFire();
    }


    //재정의
    public void showMainFeature(){
        System.out.println(this.name+"의 주요 기능 : 화재 감지");
    }
}
