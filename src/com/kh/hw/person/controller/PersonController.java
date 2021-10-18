package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Person;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
    private Person[] p = new Person[SIZE];
    private Student[] s = new Student[STUDENT_SIZE];
    private Employee[] e = new Employee[EMPLOYEE_SIZE];

    public static final int SIZE = 13;
    public static final int STUDENT_SIZE = 3;
    public static final int EMPLOYEE_SIZE = 10;


    public PersonController() {
    }

    //배열에 기존에 저장된 person 객체의 숫자를 세는 메서드
    public int personCount() {
        int count = 0; //
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

    public Student[] printStudent() {
        return s;
    }

    public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
        int count = personCount();
        p[count] = new Employee(name, age, height, weight, salary, dept);
    }

    public Employee[] printEmployee() {
        return e;
    }
}
