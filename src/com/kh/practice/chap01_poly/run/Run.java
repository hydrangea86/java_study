package com.kh.practice.chap01_poly.run;

import com.kh.practice.chap01_poly.model.vo.Member;
import com.kh.practice.chap01_poly.view.LibraryMenu;

public class Run {

    public static void main(String[] args) {
        Member mem = new Member();
        LibraryMenu lm = new LibraryMenu();

        lm.mainMenu();
    }
}
