package day07;

public class MethodBasic {

    /*
        1. 자바의 메서드는 클래스 내부, 메서드 외부에 선업합니다.
        2. 메서드의 호출은 메서드나 생성자 내부에서만 가능합니다.(메서드= 자바스크립트의 함수 개념)
     */

    // 1 ~ x까지의 누적합 (함수 앞에 return 값의 타입을 쓴다)
    static int calcTotal(int x) {
        System.out.println("야호~");
        int total = 0;
        for (int n = 1; n <= x; n++) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {

        //1 ~ 10까지의 누적합
        int result = calcTotal(10);
        System.out.println("result= " + result);

        int result1 = calcTotal(100);
        System.out.println("result= " + result1);

    }


}
