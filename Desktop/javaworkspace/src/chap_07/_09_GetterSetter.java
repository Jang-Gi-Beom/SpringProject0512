package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {

        BlackBox b1 = new BlackBox();
        b1.resolution="FHD";
        b1.price=200000;
        b1.color="블랙";
        
        //할인 행사 :원가격 삭제하고 5000원할인으로 잘못표기시
        b1.price=-5000;
        System.out.println("가격 : "+b1.price+"원");

        //고객 문의 : resolution 을 지워버렸 했을 때
        System.out.println("해상도 : "+b1.resolution);

        System.out.println("=========================");

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : "+ b2.getPrice()+"원");
        System.out.println("해상도 : "+ b2.getResolution());
        
        //->이상값과 오류가 있을 때 Get/Setter 이용하여 수정할 수 있다
    }
}
