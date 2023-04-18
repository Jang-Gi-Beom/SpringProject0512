package chap_08;

import chap_08.camera.SpeedCam;

public class _Quiz_08 {
    /*
    Q. 인퍼테이스를 이용하여 과속 단속 카메라에 교통 사고 감지 및 신고 기능을 추가
    -과속단속 카메라인 SpeedCam 클래스의 detect(), report()개선
    -교통 사고를 감지하는 AccidentDetector 신규 생성
    -신고 기능은 기존에 작성된 VideoReporter 클래스 활용
    -모든 클래스는 적절한 위치에 정의
     */
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect(); //교통사고를 감지합니다
        speedCam.report(); //직전 30초 영상과 함께 신고를 진행합니다
    }
}
