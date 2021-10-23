package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {

    public static void main(String[] args) {
        PhoneController pc = new PhoneController();
        // 결과값을 String 배열에 담아서 사용
        //String [] tmpArr = pc.method();
        for (int i = 0; i < pc.method().length; i++) {
            //System.out.println(tmpArr[i]);
            // 결과값 받아서 바로 사용 - 반복해서 사용될 경우 계속해서 메소드를 다시 호출하게 됨
            System.out.println((pc.method())[i]);
            System.out.println();
        }
    }
}
