package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        //오버라이딩 : 자식클래스에서 부모 클래스의 메소드를 덮어쓰기

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();//사진촬영, 동영상녹화
        factoryCam.showMainFeature(); //화재 감지
        speedCam.showMainFeature(); // 속도측정, 번호 인지

        //(부모)camera클래스의 showMainFeature()메소드를 (자식)클래스에서 이름 같고 내용만 다르게 덮어씌워 작성해서 사용
    }
}
