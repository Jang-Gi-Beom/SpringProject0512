package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.repoter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable { //(자식)
    //객체를 인스턴스 변수로 인터페이스를 적용해서 만듦 ->이 값을 Setter 를 통해 넣어보자
    private Detectable detector;
    private Reportable reporter;
    //(위 변수의 값을 밑 Setter 로 만들었기에, 외부에서 위 변수에 접근 못하게 private 접근제어자로 작성)
    //Setter
    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }
    //=> 이 객체를 전달받는 detector 과 reporter 를 통해서  report, detect 역할로 쓰이게 된다
    @Override //자식클래스에서 추상메소드를 구현해줌 (객체 만들 수 있게되었음)
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override //implements Detectable
    public void detect() {
            detector.detect();
    }

    @Override //implements Reportable
    public void report() {
        reporter.report();
    }

    //인터페이스를 구현하는 식으로 FactoryCam class를 바꿨는데
    //인스턴스 변수로 인터페이스로 적용
    // Setter: Setter 를 통해서 외부에서 보내주는 Detectable,Reportable 적용함으로서
    // Override : 공장에서 화재를 감지/신고를 할때 좀전에 전달 받은 detector.detect(); reporter.report();를 써가지고
    //감지/신고를 할 수 있다
}
