package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {

    //필드부
    private String[] result = new String[2];

    //메서드

    public String[] method() {
        Phone[] ph = new Phone[2];
        ph[0] = new GalaxyNote9();
        ph[1] = new V40();
        /* 부모 참조변수에 자식 객체를 담은 경우
         *  - 부모 참조변수만을 이용해서는 자식 객체에서 생성된 멤버에 접근 불가능
         *  - 다운캐스팅을 통해서 접근 가능
         * */
//		// 실체화된 객체로 다운캐스팅
//		((GalaxyNote9)ph[0]).printinformation();
//		((V40)ph[1]).printinformation();
//		// 해당 멤버가 선언된 부모 클래스로 다운캐스팅
//		((SmartPhone)ph[0]).printinformation();
//		((SmartPhone)ph[1]).printinformation()
        for (int i = 0; i < ph.length; i++) {
            // 방법 1
            // result[i] = ((SmartPhone)ph[i]).printinformation();
            // 방법 2
            if (ph[i] instanceof GalaxyNote9) {
                result[i] = ((GalaxyNote9) ph[i]).printInformation();
            } else if (ph[i] instanceof V40) {
                result[i] = ((V40) ph[i]).printInformation();
            }
        }
        return result;
    }
}
