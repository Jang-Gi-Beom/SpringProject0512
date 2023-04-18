package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        //캡슐화 (Encapsulation)
        //ex_블랙박스 클래스에, 관한 변수 메소드만 담아줌
        //정보은닉 (Information hiding) : 객체내에 있는 변수나 메소드의 직접 접근 막고
        //                               객체에서 허용한 상태(메소드)만 접근 가능하게 함
        
        //접근 제어자
        //1. private : 해당클래스내에서만 접근 가능
        //2. public : 모든 클래스 접근 가능
        //3. default : 아무것도 적지 않았을 때->같은 패키지 내애서만 접근 가능
        //4. protected : 같은 패키지내에서, 다른패키지인 경우 자식 클래스에서 접근 가능

        //Getter Setter 이용했는데도 불구하고 인터스 변수에 바로 집어 넣을 수 있는 문제!
        //클래스 더블클릭->ctrl+c->ctrl+r->위:바꿀것, 아래:바뀔 것 -> Replace ALL:바뀜

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.resolution="FHD";
        b1.setPrice(200000); //b1.price=2000 -> BlackBoxRefurbish 에서 private작성시 집어넣기 불가해짐
        b1.color="블랙";

        //할인 행사 :원가격 삭제하고 5000원할인으로 잘못표기시
        b1.setPrice(-5000);
        System.out.println("가격 : "+b1.getPrice()+"원");

        //고객 문의 : resolution 을 지워버렸 했을 때
        System.out.println("해상도 : "+b1.resolution);

        System.out.println("=========================");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : "+ b2.getPrice()+"원");
        System.out.println("해상도 : "+ b2.getResolution());

    }
}
