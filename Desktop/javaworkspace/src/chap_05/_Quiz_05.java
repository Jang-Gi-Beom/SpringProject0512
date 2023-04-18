package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        /*
        배열 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션 출력
        -250~295까지 5단위 증가
        -신발 사이즈 수 총 10가지
        ->사이즈 250(재고 있음)
         */
        int[] sizeArray=new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i]=250+(5*i);
        }
        for (int size:sizeArray) {
            System.out.println("사이즈"+size+"(재고 있음)");
        }

    }
}
