package day16.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("정수: ");
                int num = sc.nextInt(); //warn (\n 버퍼에 남아있음 문자열 입력시 문자 및 \n 둘다 남음)
                System.out.println("입력된 정수: " + num);
                System.out.println(10 / num); //warn
                break;
            } catch (InputMismatchException e) {
                sc.nextLine(); //처리되지 않은 \n 및 문자열 처리
                System.out.println("정수로만 입력하세요!");
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }
        sc.close();
        System.out.println("프로그램 정상 종료!");
    }
}
