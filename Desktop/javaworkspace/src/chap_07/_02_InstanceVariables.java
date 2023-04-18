package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        //b1이라는 BlackBox클래스로 만들어진
        //4가지의 인스턴스 변수에 대해 각각 값 지정
        b1.modelName="까망이";
        b1.resolution="FHD";
        b1.price=200000;
        b1.color="블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.resolution);

        BlackBox b2 = new BlackBox();
        b2.modelName="하양이";
        b2.resolution="UHD";

    }
}
