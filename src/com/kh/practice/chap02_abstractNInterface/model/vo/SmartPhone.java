package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {

    public SmartPhone() {
    }

    public String printInformation() {
        return "";
    }

    public void setMaker(String maker) {

    }

    public String getMaker() {

        return "";
    }

    @Override
    public String charge() {
        return null;
    }

    @Override
    public String touch() {
        return null;
    }
}
