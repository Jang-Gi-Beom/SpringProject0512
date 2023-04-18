package chap_07;

public class _Quiz_07 {
    public static void main(String[] args) {
        /*
        클래스를 이용하여 햄버거를 자동으로 만드는 프로그램 작성
        -햄버거 종류 : 햄버거, 치즈버거, 새우버거
        -각 버거는 각각 클래스로 생성
        -버거 이름 담기 위한 name 변수 정의
        -재료 정보 표기하는 cook()메소드 정의
        -공통 부분은 상속 및 메소드 오라이딩으로 처리
        -모든 클래스는 하나의 파일에 정의
        
        햄버거:양상추,패티,피클
        치즈버거:양상추,패티,피클,치즈
        새우버거:양상추,패티피클,새우
         */
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다");
        System.out.println("-----------------");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("-----------------");
        }
        System.out.println("메뉴 준비가 되었습니다");
    }
}
class HamBurger {
    public String name;

    public HamBurger() {
        this("햄버거");
    }

    public HamBurger(String name) { //생성자인데, 공통으로 name 가져오는 곳
        this.name = name;
    }

    public void cook(){
        System.out.println(this.name+"를 만듭니다");
        System.out.println("빵 사이에 들어갈 재료는?");
        System.out.println(">양상추\n+패티\n+피클");
    }

}
class CheeseBurger extends HamBurger{

    public CheeseBurger() {
        super("치즈버거");
    }
    public void cook(){
        super.cook();
        System.out.println("+치즈");
    }
}

class ShrimpBurger extends HamBurger{
    public ShrimpBurger() {
        super("새우버거");
    }
    public void cook(){
        super.cook();
        System.out.println("+새우");
    }
}
