package day04;

import org.omg.CORBA.INTERNAL;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        //1. 배열 변수 선언
        int[] arr;

        //2. 배열 객체 생성 (arr 메모리에 저장된 배열객체 0인덱스 주소 위치정보)
        arr = new int[5];

        //3. 배열의 초기화
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 30.5;
        arr[4] = 100;

        //배열의 길이 - 총 공간 수
        System.out.println(arr.length);

        //배열의 반복문 처리
        System.out.println("===========================================================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("\n============================================");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        // 값 목록으로 배열 생성하기
        // int iArr[] = new int[3];
        // new int[] 생량 첫 배열변수 선언시 이외에는 불가능
        // int[] iArr = new int[] {10, 20, 30};
        int[] iArr = {10, 20, 30};
        System.out.println("iArr= " + Arrays.toString(iArr));

        // 베열 값 변경 시 new int[] 붙여야 함
        iArr = new int[] {100, 200, 300};
        System.out.println("iArr= " + Arrays.toString(iArr));

        String[] foods = {"사과", "딸기", "복숭아", "파인애플"};
        System.out.println("\nfoods.length = " + foods.length);

        System.out.println(Arrays.toString(foods));

        //배열을 생성만하고 초기화히지 않았다면?
        //각 타입의 기본값으로 자동 초기화
        String [] bArr = new String[5];
        System.out.println(Arrays.toString((bArr)));

        //배열 복사 알고리즘 (주소 복사가 아닌 객체 복사)
        System.out.println("=========================================");
        //1. 원본배열과 크기가 같은 배열을 하나 더 생성
        String[] foods2 = new String[foods.length];

        // 2. 원본배열의 값들을 복사배열로 값 복사
        for (int i = 0; i < foods.length; i++) {
            foods2[i] = foods[i];
        }

        foods[1] = "포도";
        foods2[3] = "애플";

        System.out.println("foods:" + Arrays.toString(foods));
        System.out.println("foods2:" + Arrays.toString(foods2));

    }
}
