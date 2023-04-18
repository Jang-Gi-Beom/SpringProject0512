package chap_07;

public class BlackBoxRefurbish {

    public String modelName;
    String resolution;
    private int price;
    protected String color;

    //->변수/메소드/클래스도 접근 제어자 붙여서 사용 가능


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if(resolution ==null || resolution.isEmpty()) { //isEmpty : " "빈문자열일 때 true
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price<100000){ //최소금액 100000원 : 금액이 미만으로 나와도
            this.price=100000;
        }else {
            this.price=price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

class A{ //default : 다른 패키지에서 사용x

}
}
