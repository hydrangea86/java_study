package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

    private Rectangle r = new Rectangle();

    public String calcArea(int x, int y, int height, int width) {
        r.setX(x); r.setY(y); r.setHeight(height); r.setWidth(width);
        //int rectangleArea1 = height * width;
        //String rectangleArea = Integer.toString(rectangleArea1);
        return r.toString() + " / " + height * width;
    }

    public String calcPerimeter(int x, int y, int height, int width) {
        r.setX(x); r.setY(y); r.setHeight(height); r.setWidth(width);
        //int rectanglePerimeter1 = (height + width) * 2;
        //String rectanglePerimeter = Integer.toString(rectanglePerimeter1);
        return r.toString() + " / " + (height + width) * 2;
    }
}
