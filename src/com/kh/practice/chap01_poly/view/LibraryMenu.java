package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
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
        System.out.println("회원 정보를 입력 해주세요.");
        System.out.print("- 이름: ");
        String name = sc.next();

        System.out.print("- 나이: ");
        int age = sc.nextInt();

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
        mem = new Member(name, age, gender, 0);
        lc.insertMember(mem);

        while (true) {
            System.out.println("===== 메뉴 =====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("9. 프로그램 종료하기");
            System.out.print("\n매뉴 번호: ");
            int menuNo = sc.nextInt();
            System.out.println();

            switch (menuNo) {
                case 1:
                    System.out.println(lc.myinfo().toString());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); //프로그램 정상 종료 메서드
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public void selectAll() {
        Book[] bList = lc.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서: " + bList[i].toString());
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드: ");
        String keyword = sc.next();
        Book[] searchBook = lc.searchBook(keyword);

        for (int i = 0; i < searchBook.length; i++) {
            if (searchBook[i] != null) {
                System.out.println(searchBook[i].toString());
            }
        }
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서 번호 선택: ");
        int bookNo = sc.nextInt();
        int result = lc.rentBook(bookNo);

        switch (result) {
            case 0:
                System.out.println("성공적으로 대여 되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여가 불가능입니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지에서 확인하세요");
                break;
        }
    }
}
