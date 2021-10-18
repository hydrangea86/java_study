package com.kh.practice.answer_point.answer_model.vo;

public class AnswerCircle extends AnswerPoint {
    // 필드부
    private int radius;
    // 생성자부
    public AnswerCircle() {}
    public AnswerCircle(int x, int y, int radius) {
        super(x,y);	// 부모 클래스 생성자 호출
        this.radius = radius;
    }
    // 메서드부
    public String toString() {	// 필드 값 문자열 형태로 반환(부모 필드 포함)
        return super.toString()+" "+radius;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
