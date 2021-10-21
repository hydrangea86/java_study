package day16.exception;

public class FinallyExample {

    public static void main(String[] args) {

        try {
            String s = null;
            s.equals("hello");
            System.out.println("s는 hello와 같다.");
        } catch (Exception e) {
            System.out.println("Null Pointer 예외 발생!");
        } finally { // 마지막에 항상 실행 코드
            System.out.println("메롱");
        }
    }
}
