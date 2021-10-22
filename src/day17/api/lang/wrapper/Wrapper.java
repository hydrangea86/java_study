package day17.api.lang.wrapper;

public class Wrapper {

    //기본타입 8개(int, long, double, float, short, byte, char, boolean)를 Wrapper 클래스
    //x, y 둘다 정수
    static int x;  //x의 기본값은 0
    static Integer y; //y의 기본값은 null 객체이기때문에
    //초기 값을 o으로 하고 싶을 때는 int, 초기 값을 null로 하고 싶을 때는 Integer

    public static void main(String[] args) {

        x = 10; y = 20;

        y = x;
        x = y;

        //문자열 -> 기본타입 변환
        String s1 = "90";
        String s2 = "5.5";
        System.out.println(s1 + s2);
        System.out.println(Integer.parseInt(s1) + Double.parseDouble(s2));

    }

}
