package day13.static_;

public class Calculator {
    String madeBy; //제조사
    String color; //색상
    static double pi; //원주율

    void 색칠하다() {
        this.color = "빨강";
    }

    static double 원의_넓이를_계산하다(int 반지름) {
        return 반지름 * 반지름 * pi;
    }

    //main를 쓰는 이유는 실행 메서드 메인은 하나이기 때문
    public static void main(String[] args) {

        Calculator 샤프 = new Calculator();
        샤프.색칠하다();

        double result = Calculator.원의_넓이를_계산하다(5);
        System.out.println(result);
        Math.random();


        Calculator c1 = new Calculator();
        c1.madeBy = "샤프";

        Calculator c2 = new Calculator();
        c2.madeBy = "카시오";

        System.out.println("c1의 모델명: " + c1.madeBy);
    }

}
