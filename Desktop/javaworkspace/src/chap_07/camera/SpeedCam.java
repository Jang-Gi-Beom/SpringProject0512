package chap_07.camera;

//SpeedCam is a Camera(Is-A)이즈어 관계
public class SpeedCam extends Camera{ //자식 클래스)
    public String name;
    
    //생성자
    public SpeedCam() {
        //this.name="과속 단속 카메라"; //직접 접근
        super("과속 단속 카메라"); //부모 클래스 메소드 호출
    }
    public void takePicture(){
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }
    public void checkSpeed(){
        //속도 체크
        System.out.println("속도를 측정합니다");
    }
    public void recognizeLicensePlate(){
        //번호 인식
        System.out.println("차량 번호를 인식합니다");
    }

    @Override //어노텐션: '부모클래스를 재정의 한거야 '라고 알려준 것
    // 컴파일 : 우리가 작성한 코드를 컴퓨터가 알아볼 수있는 형태로 변경하는 것
    // 컴파일러 : 위 역할을 하는 것
    public void showMainFeature() {
        System.out.println(this.name+"의 주요 기능 : 속도측정, 번호 인지");
    }
}
