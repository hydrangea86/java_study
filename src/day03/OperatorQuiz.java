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
            String operator;
            int correctInput = 0;
            if (rn3 == 0) {
                operator = "+";
                correctInput = rn1 + rn2;
            } else if (rn3 == 1) {
                operator = "-";
                correctInput = rn1 - rn2;
                if(rn1 < rn2) {
                    continue;
                }else if (rn1 == rn2) {
                    rn1++;
                }
            } else {
                operator = "x";
                correctInput = rn1 * rn2;
            }
            System.out.printf("%d %s %d = ? \n", rn1, operator, rn2);
            System.out.print("> ");
            int userInput = sc.nextInt();
            if (userInput == correctInput) {
                System.out.println("정답!");
                correctAnswer++;
            } else if (userInput == 0) {
                break;
            } else {
                System.out.println("틀림!");
                wrongAnswer++;
            }
        }
        System.out.printf("총 맞힌 개수: %d\n총 틀린 개수: %d", correctAnswer, wrongAnswer);
        sc.close();
    }
}
