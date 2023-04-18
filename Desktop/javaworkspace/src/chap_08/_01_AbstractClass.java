package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        //데이터 추상화(Data Abstraction) : 불필요 정보 숨기고 필요한 정보만 보여줌
        //abstract
        //추상클래스(아직 완성되지 않은 클래스):객체 못만듦
        //추상메소드(추상 클래스에서만 사용 가능):껍데기만 있음 _자식클래스에서 반드시 구현해줘야 함->객체생성 가능

        //부모로 객체 생성 불가 (abstract) 카메라 클래스로 생성 불가
        //Camera camera = new Camera();

        //자식은 추상메소드 구현했기에 객체 생성 가능
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();
        
        //카메라클래스를 상속한 자식 클래스는  부모형태로 객체 생성 가능
        Camera speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
