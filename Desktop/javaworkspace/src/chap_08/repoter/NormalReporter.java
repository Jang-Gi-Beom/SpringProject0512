package chap_08.repoter;

public class NormalReporter implements Reportable{
    @Override //뼈대만 있는 것을 구현함
    public void report() {
        System.out.println("일반 화재 신고 진행함");
    }
}
