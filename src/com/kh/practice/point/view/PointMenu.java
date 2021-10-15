package com.kh.practice.point.view;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

import java.util.Scanner;

public class PointMenu {

    private Scanner sc = new Scanner(System.in);
    private CircleController c = new CircleController();
    private RectangleController r = new RectangleController();

    public void mainMenu() {
        while (true) {
            System.out.println("====== 메뉴 =====");
            System.out.println("1. 원");
            System.out.println("2. 사격형");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    circleMenu();
                    break;
                case 2:
                    rectangleMenu();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); //프로그램 정상 종료 메서드
            }
        }
    }

    public void circleMenu() {
        while (true) {
            System.out.println("====== 원 메뉴 ======");
            System.out.println("1. 원 둘레");
            System.out.println("2. 원 넓이");
            System.out.println("9. 메인으로");
            System.out.print("메뉴번호: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    calcCircum();
                    break;
                case 2:
                    calcCircleArea();
                    break;
                case 9:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
            }
        }
    }

    public void rectangleMenu() {

    }

    public void calcCircum() {

    }

    public void calcCircleArea() {

    }

    public void calcPerimeter() {

    }

    public void calcRectArea() {

    }

}
