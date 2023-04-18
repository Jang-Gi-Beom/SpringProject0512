package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;
import sun.java2d.pipe.SpanClipRenderer;

public class _15_Super {
    public static void main(String[] args) {
        //super : 부모클래스의 어떤 것을 자식클래스에서 사용하는 역할

        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("-------------------");
        speedCam.takePicture();



    }
}
