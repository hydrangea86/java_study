package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
    private int[] lotto;

    public Lotto() {
        lotto = new int[6];

        //중복없는 1~45의 랜덤정수를 6개 담아야 함.
        /*
            1. 해당범위의 랜덤 정수를 하나를 생성
            2. lotto배열을 탐색하여 1번에서 생성한 숫자와
               같은 숫자가 발견되는지 확인
            3-1. 발견되었다면 배열에 담지 말고 새로운 랜덤 정수 생성 후 2번 반복
            3-2. 중복이 발견되지 않았다면 빈 자리에 해당 숫자 추가
            4. 배열이 가득찰때까지 무한히 1~3번 반복
         */

       /*
        int successCnt = 0; //로또번호를 잘 저장했을 때 증가

        while (successCnt < lotto.length) {
            int rn = (int) (Math.random() * 45) + 1;

            boolean flag = true;
            for (int i = 0; i < successCnt; i++) {
                if (rn == lotto[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                lotto[successCnt++] = rn;
            }
        }
        */
        for (int i = 0; i < lotto.length; i++) {
            int rn = (int) (Math.random() * 45 + 1);
            lotto[i] = rn;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    public void information() {
        System.out.println("로또번호:" + Arrays.toString(lotto));
    }
}
