package day02;

public class LogicalOperator {
    public static void main(String[] args) {

        // 논리 하나일 때 두개 일 때 차이.
        int x = 10, y = 20;
        boolean result1 = (x != 10) && (++y == 21);
        boolean result2 = (x == 10) || (++y == 21);


        /*
        boolean result1 = (x != 10) & (++y == 21);
        boolean result2 = (x == 10) | (++y == 21);
        */

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
