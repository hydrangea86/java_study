package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

    public Student[] sArr = new Student[5];

    //상수: 값 변경 불가능한 데이터
    public static final int CUT_LINE = 60;

    public StudentController() {
        sArr[0] = new Student("김길동", "자바", 100);
        sArr[1] = new Student("박길동", "디비", 50);
        sArr[2] = new Student("이길동", "화면", 85);
        sArr[3] = new Student("정길동", "서버", 60);
        sArr[4] = new Student("홍길동", "자바", 20);
    }

    public Student[] printStudent() {
        return null;
    }

    public int sumScore() {
        return 0;
    }

    public double[] avgScore() {
        return null; //doubl, int 배열은 기본 값 null
    }

}