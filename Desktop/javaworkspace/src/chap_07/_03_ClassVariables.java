package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName="까망이";
        System.out.println( b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName="하양이";
        System.out.println( b2.modelName);

        //자동신고기능 :특정범위 초과시 충돌 감지 자동신고 기능 개발 여부
        System.out.println("--개발전---");
        System.out.println(b1.modelName+"자동신고기능 : "+ b1.canAutoReport);
        System.out.println(b2.modelName+"자동신고기능 : "+ b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동신고기능 : "+BlackBox.canAutoReport);

        //객체명.클래스변수보단 클래스명.클래스변수로 사용하기

        //기능 개발
        BlackBox.canAutoReport=true;
        System.out.println("--개발후---");
        System.out.println(b1.modelName+"자동신고기능 : "+ b1.canAutoReport);
        System.out.println(b2.modelName+"자동신고기능 : "+ b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동신고기능 : "+BlackBox.canAutoReport);

        //어떤 클래스에서 만들어진 객체에다가 공통적인 적용해야하는 상황?
        //=>인스턴스보단 클래스 변수를 만들어 사용하기
    }
}
