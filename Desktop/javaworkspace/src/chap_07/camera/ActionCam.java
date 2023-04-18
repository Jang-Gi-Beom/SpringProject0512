package chap_07.camera;

public final class ActionCam extends Camera{
    public final String lens; //선언1) :직접 출력 ,= "광각렌즈";
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈"; //선언 2) : 생성자에서 출력 (객체가 만들어질 시점에 생성자 호출되기에)
    }
    //final : 오버라이딩 불가해짐
    public final void makeVideo(){
        System.out.println(this.name+" : "+this.lens+"로 촬영한 멋진 비디오를 제작합니다");
    }
}
