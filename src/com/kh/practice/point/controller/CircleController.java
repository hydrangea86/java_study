package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;
import com.kh.practice.point.model.vo.Point;

public class CircleController {
    private Circle c = new Circle();
    private static final double PI = 3.141592653589793;


    public String calcArea(int x, int y, int radius) {
        c.setX(x); c.setY(y); c.setRadius(radius);
        // String circleArea = Double.toString(circleArea1);
        // string 타입 더하기 double 타입은 암묵적으로 형 변환(공부하기)
        return c.toString() + " / " + Math.pow(radius, 2) * PI;
    }

    public String calcCircum(int x, int y, int radius) {
        c.setX(x); c.setY(y); c.setRadius(radius);
        //double circleCircum1 = radius * 2 * PI ;
        //String circleCircum = Double.toString(circleCircum1);
        return c.toString() + " / " + radius * 2 * PI;
    }

}
