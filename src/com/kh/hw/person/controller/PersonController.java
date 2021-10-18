package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Person;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
    private Person[] p = new Person[SIZE];
    public static final int SIZE = 20;
    private Student[] s = new Student[SIZE];

    public PersonController() {
    }

    //배열에 기존에 저장된 person 객체의 숫자를 세는 메서드
    public int personCount() {
        int count = 0; //숫자를 세는 변수
        for (Person person : p) {
            if (person == null) break;
            count++;
        }
        return count;
    }

    public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
        int count = personCount();
        s[count] = new Student(name, age, height, weight, grade, major);
    }

}
