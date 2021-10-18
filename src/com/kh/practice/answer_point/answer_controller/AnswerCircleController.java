package com.kh.practice.answer_point.answer_controller;

import com.kh.practice.point.model.vo.Circle;

public class AnswerCircleController {
    // 필드부
    private Circle c = new Circle();
    // 생성자부
    // public CircleController(){} - 디폴트 생성자 사용
    // 메서드부
    public String calcArea(int x, int y, int radius) {
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        double area = Math.PI * radius * radius;
        return c.toString()+" / "+area;
    }
    public String calcCircum(int x, int y, int radius) {
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        double circum = Math.PI * radius * 2;
        return c.toString()+" / "+circum;
    }
}
