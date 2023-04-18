package chap_08.detector;

public interface Detectable {
    
    //인터페이스에 변수 선언을 하면 public static final 이 자동으로 들어가 있다(생략)
    //ex) public static final String name="감지자";
    
    public abstract void detect(); //감지
    //인터페이스에서 만들어진 메소드는 자동으로 public abstract 가 들어간가 있다(생략)
}
