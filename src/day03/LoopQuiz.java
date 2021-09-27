package day03;

import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수1: ");
        int num1 = sc.nextInt();
        System.out.print("정수2: ");
        int num2 = sc.nextInt();
        sc.close();

        int total = 0;
        int n = num1;
        while(n <= num2) {
            total += n;
            n++;
        }
        System.out.printf("%d에서 %d까지의 총합: %d \n", num1, num2, total);
    }
}
