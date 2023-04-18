package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.repoter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable { //(자식)
    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect(){
        System.out.println("사고 감지함");
    }
    public void report(){
        System.out.println("사고 신고 진행함");
    }
}
