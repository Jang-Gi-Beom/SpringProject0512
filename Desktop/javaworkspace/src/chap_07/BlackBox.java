package chap_07;

public class BlackBox {
    //인스턴스 변수
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;
    //static : 클래스 변수
    static int counter=0;//시리얼번호 생성 ++연산자로 증가
    static boolean canAutoReport = false; //(자동신고기능)

    //생성자
    BlackBox(){
 //       System.out.println("기본생성자호출");
 //       this.serialNumber=++counter;
 //       System.out.println("새로운 시리얼 넘버를 발급 받았다 : "+this.serialNumber);
    }
    BlackBox(String modelName, String resolution, int price,String color){
//        this(); //기본 생성자 바로 접근하게 되어 해당부분 실행 뒤 넘어온다 //기본생성자 호출

//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName=modelName;
//        this.resolution=resolution;
//        this.price=price;
//        this.color=color;
    }
    //기능을 저장할 수 있다->메소드
    void autoReport(){
        if(canAutoReport){
            System.out.println("충돌 감지 자동 신고 한다");
        }else {
            System.out.println("자동신고 기능 지원 안한다");
        }
    }
    void insertMemoryCard(int capacity){
        System.out.println("메모리삽입 되었음");
        System.out.println("용량 : "+capacity+"GB이다");
    }
    //전달/반환값이 있는 메소드
    int getVideoFileCount(int type){
        if(type==1){
            return 9;
        }else if(type ==2){
            return 1;
        }
        return 10;
    }
    void record(boolean showDateTime, Boolean showSpeed, int min){
        System.out.println("녹화시작");
        if(showDateTime){
            System.out.println("영상에 날짜정보 표시");
        }
        if(showSpeed){
            System.out.println("영상에 속도정보 표시");
        }
        System.out.println("영상은 "+min+"분 단위로 기록된다");
    }
    //OverLoading
    void record(){
        record(true,true,5);//위 record 메소드
    }
    //클래스 메소드
    static void callServiceCenter(){
        System.out.println("서비스센터(1500-0000)으로 연결합니다");
        //modelName="test"; ->인스턴스변수는 객체가 만들어져야 만들어지는 변수여서 직접 접근 불가
    }
    public void appendModelName(String modelName) {
        this.modelName += modelName;
        //인스턴스 모델명 +=파라미터 모델명
    }

    //Getter(가져옴)&Setter(설정)
    String getModelName(){
        return modelName;
    }
    void  setModelName(String modelName){
        this.modelName=modelName;
    }
    String getResolution(){
        if(resolution ==null || resolution.isEmpty()) { //isEmpty : " "빈문자열일 때 true
                return "판매자에게 문의하세요";
        }
        return resolution;
    }
    void setResolution(String resolution){
        this.resolution=resolution;
    }
    int getPrice(){
        return price;
    }
    void  setPrice(int price){
        if(price<100000){ //최소금액 100000원 : 금액이 미만으로 나와도
            this.price=100000;
        }else {
            this.price=price;
        }
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color=color;
    }
}
