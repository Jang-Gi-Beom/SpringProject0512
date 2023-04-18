package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        //다형성

        //class Person : 사람
        //class Student extends Person : 학생(학생은 사람이다 Student is a person)
        //class Teacher extends Person : 선생님(선생님은 사람인다 Teacher is a person)

        Camera camera = new Camera(); //부모클래스는 부모클래스 생성
        Camera factoryCam = new FactoryCam(); //부모클래스는 상속하는 자식클래스의 객체를 생성
        Camera speedCam = new SpeedCam();

        //형태가 다양하다
        camera.showMainFeature();  //사진 촬영, 동영상 녹화
        factoryCam.showMainFeature();  //화재 감지
        speedCam.showMainFeature(); //속도측정, 번호 인지

        System.out.println("==================================");

        //부모클래스 객체이름 = new 자식클래스;
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("==================================");
        //쓸 수 없는 이유 : 부모클래스로 생성했기에 부모 클래스의 메소드만 접근 가능
        //factoryCam.detectFire();
        //speedCam.checkSpeed();
        //speedCam.recognizeLicensePlate();

        if(camera instanceof Camera){ //camera가 Camera로 만들어진 인스턴스라면 (true)
            System.out.println("카메라입니다");
        }
        if(factoryCam instanceof  FactoryCam){
            //(FactoryCam)factoryCam;  //형변환
            ((FactoryCam) factoryCam).detectFire(); //FactoryCam 의 메소드 사용 가능

            System.out.println("공장 카메라입니다");
        }
        if(speedCam instanceof SpeedCam){
            ((SpeedCam) speedCam).recognizeLicensePlate();
            ((SpeedCam) speedCam).recordVideo();//->형변환 되어 객체가 각각 가지는 주요기능을 써볼 수 있다
            System.out.println("과속 단속 카메라입니다");
        }
        
        //모든 자바 클래스는 사용자 모르게 Object 클래스를 상속하고 있다
        //Object : 자바의 조상 같은 느낌 -한꺼번에 관리 가능하다
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();

    }
}
