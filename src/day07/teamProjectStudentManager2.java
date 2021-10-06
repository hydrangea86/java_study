package day07;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class teamProjectStudentManager2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int managerNum = 0; // 정보출력을 위한 초기화
        String name[] = {}; // for문 사용시 name.length 를 기준으로 사용
        String major[] = {};
        String phone[] = {};
        String sNumber[] = {};
        float avg[] = {};

        int select = 0; //메뉴 입력값 저장 변수

        Scanner sc = new Scanner(System.in);

        System.out.println("------------ 학생 관리 프로그램 ------------");

        while (true) {
            System.out.println("\n<<<<<<<<<<<<<< 메뉴 >>>>>>>>>>>>>>>>");
            System.out.println("1. 정보 입력");
            System.out.println("2. 정보 출력");
            System.out.println("3. 정보 수정");
            System.out.println("4. 종료");
            System.out.print("선택>> ");
            select = sc.nextInt();
            sc.nextLine(); // enter skip

            //먼저 처리할 메뉴: 종료
            if (select == 4) {
                System.out.println("종료합니다.");
                break;
            }
            switch (select) {
                case 1: //입력 메뉴 서브타이틀 출력
                    while (true) {
                        System.out.println("------------ 학생 등록 ------------");
                        System.out.print("이름: ");
                        String SName = sc.nextLine();
                        System.out.print("학과: ");
                        String SMajor = sc.nextLine();
                        System.out.print("연락처: ");
                        String SPhone = sc.nextLine();
                        System.out.print("학번: ");
                        String SNumber = sc.nextLine();
                        System.out.print("학점: ");
                        //avg[i] = sc.nextFloat();
                        String fStr = sc.nextLine();
                        float SAvg = Float.parseFloat(fStr);
                        String[] tempName = new String[name.length + 1];
                        String[] tempMajor = new String[major.length + 1];
                        String[] tempPhone = new String[phone.length + 1];
                        String[] tempSNumber = new String[sNumber.length + 1];
                        float[] tempAvg = new float[avg.length + 1];
                        for (int i = 0; i < name.length; i++) {
                            tempName[i] = name[i];
                            tempMajor[i] = major[i];
                            tempPhone[i] = phone[i];
                            tempSNumber[i] = sNumber[i];
                            tempAvg[i] = avg[i];
                        }
                        tempName[tempName.length - 1] = SName;
                        name = tempName;
                        tempName = null;

                        tempMajor[tempMajor.length - 1] = SMajor;
                        major = tempMajor;
                        tempMajor = null;

                        tempPhone[tempPhone.length - 1] = SPhone;
                        phone = tempPhone;
                        tempPhone = null;

                        tempSNumber[tempSNumber.length - 1] = SNumber;
                        sNumber = tempSNumber;
                        tempSNumber = null;

                        tempAvg[tempAvg.length - 1] = SAvg;
                        avg = tempAvg;
                        tempAvg = null;

                        System.out.println("계속 등록하시겠습니까? (y / n)");
                        String answer = sc.nextLine();
                        if (answer.equals("y")) {
                            continue;
                        } else {
                            System.out.println("등록 완료!");
                            break;
                        }
                    }
                    break;
                case 2: //출력 메뉴
                    System.out.println("------------ 정보 출력 ------------");
                    for (int i = 0; i < name.length; i++) {
                        //sc.nextLine(); //enter skip 해줌
                        int No = i + 1; //정보 입력 학생 순차적 넘버 부여 초기화
                        System.out.print("No." + No + " " + "[이름]: " + name[i] + ",");
                        System.out.print(" [학과]: " + major[i] + ",");
                        System.out.print(" [연락처]: " + phone[i] + ",");
                        System.out.print(" [학번]: " + sNumber[i] + ",");
                        System.out.print(" [학점]: " + avg[i] + "\n");
                    }
                    break;
                case 3: //정보 수정
                    System.out.println("------------ 정보 수정 ------------");
                    while (true) {
                        System.out.print("수정할 학생 이름: ");
                        String targetName = sc.next();

                        int index = -1;
                        for (int i = 0; i < name.length; i++) {
                            if (targetName.equals(name[i])) ;
                            index = i;
                            System.out.println("index: " + index);
                            break;
                        }
                        System.out.print("수정할 학과: ");
                        major[index] = sc.nextLine();
                        System.out.print("수정할 연락처: ");
                        phone[index] = sc.nextLine();
                        System.out.print("수정할 학번: ");
                        sNumber[index] = sc.nextLine();
                        System.out.print("수정할 학점: ");
                        avg[index] = sc.nextFloat();
                        System.out.println("계속 수정하시겠습니까? (y / n)");
                        String answer = sc.nextLine();
                        if (answer.equals("y")) {
                            continue;
                        } else {
                            break;
                        }
                    }

                    break;
            default: //잘못된 메뉴 입력
                System.out.println("잘못 누르셨습니다.");
                break;
        }
    }
}//main method
}//class
