package day07;

import java.util.Scanner;

public class TeamProjectStudentManager1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int max = 1;
        String name[] = new String[max];
        String major[] = new String[max];
        String phone[] = new String[max];
        String sNumber[] = new String[max];
        float avg[] = new float[max];

        int select = 0; //메뉴 입력값 저장 변수

        Scanner sc = new Scanner(System.in);

        System.out.println("--- 학생 관리 프로그램 ---");

        while (true) {
            System.out.println("\n<< 메뉴 >>");
            System.out.println("1. 정보 입력");
            System.out.println("2. 정보 출력");
            System.out.println("3. 종료");
            System.out.print("선택>");
            select = sc.nextInt();

            //먼저 처리할 메뉴: 종료
            if(select == 3) {
                System.out.println("종료합니다.");
                break;
            }
            switch (select) {
                case 1: //입력 메뉴 서브타이틀 출력
                    System.out.println("학생 등록");
                    for (int i = 0; i < max; i++) {
                        System.out.println("------------");
                        sc.nextLine(); // enter skip
                        System.out.print("이름: ");
                        name[i] = sc.nextLine();
                        System.out.print("학과: ");
                        major[i] = sc.nextLine();
                        System.out.print("연락처: ");
                        phone[i] = sc.nextLine();
                        System.out.print("학번: ");
                        sNumber[i] = sc.nextLine();
                        System.out.print("평균: ");
                        //avg[i] = sc.nextFloat();
                        String fStr = sc.nextLine();
                        avg[i] = Float.parseFloat(fStr);
                    }
                    break;
                case 2: //출력 메뉴
                    System.out.println();
                    for (int i = 0; i < max; i++) {
                        System.out.println("------------");
                        //sc.nextLine(); //enter skip 해줌
                        System.out.print("[이름]: " + name[i] + ",");
                        System.out.print(" [학과]: " + major[i] + ",");
                        System.out.print(" [연락처]: " + phone[i] + ",");
                        System.out.print(" [학번]: " + sNumber[i] + ",");
                        System.out.print(" [평균]: " + avg[i]);
                    }
                    break;
                default: //잘못된 메뉴 입력
                    System.out.println("잘못 누르셨습니다.");
                    break;
            }
        }
    }//main method
        private static int printMenu() {
            return 0;
        }
}//class
