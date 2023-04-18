package chap_08;


import chap_07.BlackBox;
import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName="까망이"; //(public) 모든 패키지 가능
        //b1.resolution="UFD"; //(default) 패키지가 달라 불가.
        //b1.price=20000;//(private) 선언한 클래스 내부가 아님
        //b1.color="블랙";//(protected) 자식클래스가 x

        BlackBox b2;

    }
}
