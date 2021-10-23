package com.kh.hw.person.view;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

import javax.print.DocFlavor;
import java.util.Scanner;

public class PersonMenu {

    private Scanner sc = new Scanner(System.in);
    private PersonController pc = new PersonController();

    public PersonMenu() {
    }

    //메인메뉴 출력 메서드
    public void mainMenu() {

        while (true) {
            int[] count = pc.personCount();
            System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
            System.out.println("현재 저장된 학생은 " + count[0] + "명입니다.");
            System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
            System.out.println("현재 저장된 사원은 " + count[1] + "명입니다.");

            System.out.println();
            System.out.println("1. 학생메뉴");
            System.out.println("2. 사원메뉴");
            System.out.println("9. 끝내기");
            System.out.print("메뉴번호: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    studentMenu();
                    break;
                case 2:
                    employeeMenu();
                    break;
                case 9:
                    System.out.println("종료합니다.");
                    System.exit(0);
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
            }
        }
    }

    public void studentMenu() {
        while (true) {
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 보기");
            System.out.println("9. 메인으로 돌아갑니다.");

            int count = pc.personCount()[0];
            if (count == 3) {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찾기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
            }
            System.out.printf("메뉴번호: ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    if (count == 3) {
                        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    } else {
                        insertStudent();
                    }
                    break;
                case 2:
                    printStudent();
                    break;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    public void insertStudent() {
        while (true) {
            System.out.println("학생 이름: ");
            String name = sc.next();

            System.out.println("학생 나이: ");
            int age = sc.nextInt();

            System.out.println("학생 키: ");
            double height = sc.nextInt();

            System.out.println("학생 몸무게: ");
            double weight = sc.nextInt();

            System.out.println("학생 학년: ");
            int grade = sc.nextInt();

            System.out.println("학생 전공: ");
            sc.nextLine();
            String major = sc.nextLine();
            pc.insertStudent(name, age, height, weight, grade, major);
            int count = pc.personCount()[0];
            if (count != 3) {
                System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요: ");
                String select = sc.nextLine();
                if (select.equals("n") || select.equals("N")) {
                    return;
                }
            } else {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
                return;

            }
        }
    }

    public void printStudent() {
        Student[] s = pc.printStudent();
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                System.out.println(s[i]);
            }
        }
    }

    public void employeeMenu() {
        while (true) {
            System.out.println("1. 사원 추가");
            System.out.println("2. 사원 보기");
            System.out.println("9. 메인으로");
            int count = pc.personCount()[1];
            if (count == 10) {
                System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
            }
            System.out.print("메뉴 번호: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    insertEmployee();
                    break;
                case 2:
                    printEmployee();
                    break;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    return;
                default:
                    System.out.println("“잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    public void insertEmployee() {
        System.out.println("사원 이름: ");
        String name = sc.nextLine();
        System.out.println("사원 나이: ");
        int age = sc.nextInt();
        System.out.println("사원 키: ");
        double height = sc.nextInt();
        System.out.println("사원 몸무게: ");
        double weight = sc.nextInt();
        System.out.println("사원 급여: ");
        int salary = sc.nextInt();
        System.out.println("사원 부서: ");
        sc.nextLine();
        String dept = sc.nextLine();
        pc.insertEmployee(name, age, height, weight, salary, dept);
        int count = pc.personCount()[1];
        if (count != 10) {
            System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요: ");
            String select = sc.nextLine();
            if (select.equals("n") || select.equals("Y")) {
                return;
            }
        } else {
            System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
            return;
        }
    }

    public void printEmployee() {
        Employee[] e = pc.printEmployee();
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null) {
                System.out.println(e[i]);
            }
        }
    }
}
