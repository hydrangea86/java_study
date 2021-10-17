package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;
import com.kh.practice.point.model.vo.Point;

public class CircleController {
    private Circle c = new Circle();
    private static final double PI = 3.141592653589793;


    public String calcArea(int x, int y, int radius) {
        c.setX(x); c.setY(y); c.setRadius(radius);
        double circleArea1 = Math.pow(radius, 2) * PI;
        String circleArea = Double.toString(circleArea1);
        return c.toString() + " / " + circleArea;
    }

    public String calcCircum(int x, int y, int radius) {
        c.setX(x); c.setY(y); c.setRadius(radius);
        double circleCircum1 = radius * 2 * PI ;
        String circleCircum = Double.toString(circleCircum1);
        return c.toString() + " / " + circleCircum;
    }

}
