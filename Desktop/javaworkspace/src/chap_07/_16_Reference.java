package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        //참고
        //기본자료형(Primitive Data Types) : int float, double, long, boolean....(소문자 시작)
        int[] i = new int[3];
        System.out.println(i[0]); //0

        double[] d = new double[3];
        System.out.println(d[0]); //0.0  ->기본값을 가짐, 메소드를 가지지 않음

        //참조 자료형(Non-Primitive, Reference Data Types): String, Camera, FactoryCam, SpeedCam...(대문자 시작)
        String[] s = new String[3];
        System.out.println(s[0]);//->null값 가짐

        Camera[] c = new Camera[3];
        System.out.println(c[0]==null); //true, 메소드를 가질 수도 있다

        int a=10;
        int b=20;
        b=a;
        System.out.println(a); //10
        System.out.println(b); //10
        b=30;
        System.out.println(a); //10
        System.out.println(b); //30 ->a와 b는 별도로 움직임, 서로 연관x

        System.out.println("=========");

        Camera c1= new Camera();
        Camera c2= new Camera();
        c1.name="카메라1";
        c2.name="카메라2";
        System.out.println(c1.name);//카메라1
        System.out.println(c2.name);//카메라1
        c2=c1; //가리키는 대상이 달라짐
        System.out.println(c1.name);//카메라1
        System.out.println(c2.name);//카메라1
        c2.name="고장난 카메라";
        System.out.println(c1.name);//고장난 카메라
        System.out.println(c2.name);//고장난 카메라
        changeName(c2); //참조하는 대상이 달라짐
        System.out.println(c1.name);//잘못된 카메라
        System.out.println(c2.name);//잘못된 카메라
        c2=null; //참조하는 것이 없어짐
        //System.out.println(c2.name); //c2.name 가리키는 대상이 아예 없음->오류걸림

    }
    public static void changeName(Camera camera){
        camera.name = "잘못된 카메라";

    }
}
