package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.repoter.NormalReporter;
import chap_08.repoter.Reportable;
import chap_08.repoter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        //인터페이스 : 뼈대만 제공
        //상속(extends) ->1부모(단일)

//alt+enter : 해당 클래스 import 됨
            
        //(신고)
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();
        Reportable videoReporter = new VideoReporter();
        videoReporter.report();
        //=>인터페이스를 구현함으로서 인터페이스를 구현하는 모든 클래스는
        // 인터페이스 자체를 통해서 참조할 수 있고
        // 인터페이스 내의 report()라는 메소드는 항상 구현 되어 있다
        System.out.println("=============");
        //(감지)
        Detectable fireDetector = new FireDetector();
        fireDetector.detect();
        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("=============");
        //최종 공장에서 사용하고자하는 조합
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);  //(감지)advancedFireDetector 로 교체해서 확인
        factoryCam.setReporter(normalReporter);  //(신고)videoReporter 로 교체해서 확인

        factoryCam.detect();
        factoryCam.report();



    }
}
