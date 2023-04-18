package chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName="까망이";//까망이(최신형)
        b1.appendModelName("(최신형)"); //alt+enter ->BlcakBox 클래스에 메소드 생성
                                        //ctrl+shift+i->해당메소드 구조 볼 수 있음
        System.out.println(b1.modelName);

    }
}
