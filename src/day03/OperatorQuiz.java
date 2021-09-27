package day03;

import java.util.Scanner;

public class OperatorQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctAnswer = 0;
        int wrongAnswer = 0;
        while (true) {
            int rn1 = (int) (Math.random() * 20) + 1;
            int rn2 = (int) (Math.random() * 20) + 1;
            int rn3 = (int) (Math.random() * 3);
            String operator = Integer.toString(rn3);
            int correctInput = 0;
            if (rn3 == 0) {
                operator = "+";
                correctInput = rn1 + rn2;
            } else if (rn3 == 1) {
                operator = "-";
                if(rn1 < rn2) {
                    System.out.printf("%d %s %d = ? \n", rn2, operator, rn1);
                    correctInput = rn2 - rn1;
                } else {
                    correctInput = rn1 - rn2;
                }
            } else {
                operator = "x";
                correctInput = rn1 * rn2;
            }
            System.out.printf("%d %s %d = ? \n", rn1, operator, rn2);
            int userInput = sc.nextInt();
            if (userInput == correctInput) {
                System.out.println("정답입니다");
                correctAnswer++;
            } else if (userInput == 0) {
                break;
            } else {
                System.out.println("틀렸습니다");
                wrongAnswer++;
            }
        }
        System.out.printf("총 맞힌 개수: %d\n총 틀린 개수: %d", correctAnswer, wrongAnswer);
    }
}
