package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance{
    public static void main(String[] args) {
        //상속 : 부모클래스의 모든 것들을 자식클래스에서 가져다 쓴다
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);
        
        //ctrl+alt+좌우 방향키 : 이전화면으로 이동
        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        //다른 클래스들의 같은 메소드는 하나로 : (1부모)Camera---(자식)factoryCam,speedCam---(공통)takePicture(),recordVideo

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
