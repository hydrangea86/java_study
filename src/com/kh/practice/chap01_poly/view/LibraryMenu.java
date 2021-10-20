package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryController lc = new LibraryController();
    private Member mem = new Member();
    private Scanner sc = new Scanner(System.in);

    public LibraryMenu() {
    }

    public void mainMenu() {

        //이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
        // LibraryController의 insertMember() 메소드에 전달

        System.out.print("- 이름: ");
        String name = sc.nextLine();
        mem.setName(name);
        System.out.print("- 나이: ");
        int age = sc.nextInt();
        mem.setAge(age);

        char gender = 0;
        while (true) {
            System.out.print("- 성별(M/F): ");
            gender = sc.next().toLowerCase().charAt(0);
            if (gender == 'm' || gender == 'f') {
                break;
            } else {
                System.out.println("\n# 성별을 다시 입력하세요!");
            }
        }
        mem.setGender(gender);
        lc.insertMember(mem);






        while (true) {

            System.out.println("===== 메뉴 =====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("9. 프로그램 종료하기");
            System.out.print("\n매뉴 번호: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    lc.myinfo();
                    break;
            }
        }
    }

    public void selectAll() {

    }

    public void searchBook() {

    }

    public void rentBook() {

    }

}


