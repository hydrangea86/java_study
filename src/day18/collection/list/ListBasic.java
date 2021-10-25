package day18.collection.list;

import java.util.*;

public class ListBasic {

    public static void main(String[] args) {

//        String[] strs = new String[10];
        List<String> sList = new ArrayList<>(); //배열 타입 제한 ex) <String>
        // LinkedList<String> sList1 = new LinkedList<>(); //배열 타입 제한 ex) <String>

        String s1 = "멍멍이";
        String s2 = "야옹이";

        //list에 객체 추가하기: add(obj)
        sList.add(s1);
        sList.add(s2);
        System.out.println(sList);

        sList.add("짹쨱이");
        sList.add("개굴이");
        sList.add("어흥이");
        sList.add("야옹이"); //중복데이터 저장 가능
        System.out.println(sList);

        //리스트에 저장된 객체 수 얻기: size()

        int size = sList.size();
        System.out.println("size = " + size);

        //리스트에 중간 삽입: add(index, obj) (** 사이즈가 큰 배열에 중간 삽입을 할경우 LinkedList 사용)
        sList.add(2, "두껍이");
        System.out.println(sList);

        //리스트 객체 수정: set(index, obj)
        sList.set(3, "꾹꾹이");
        System.out.println(sList);

        //리스트 객체 삭제: remove(index), remove(obj)
        sList.remove(6);
        sList.remove("개굴이");
        System.out.println(sList);

        //리스트 객체 참조: get(index)
        String s = sList.get(2);
        System.out.println("s = " + s);

        //리스트에 저장된 객체의 인덱스 얻기: indexof(obj)
        int index = sList.indexOf("어흥이");
        System.out.println("index = " + index);

        //리스트에 저장된 데이터 유무 확인: contains(obj)
        boolean b = sList.contains("꾺꾺이");

        //boolean b = !sList.contains("꾺꾺이");
        System.out.println("b = " + b);

        //리스트의 반복문 처리
        System.out.println("================================");
        for (int i = 0; i < sList.size(); i++) {  // if문 사용으로 특정 부분 출력 가능
            System.out.println(sList.get(i));
        }

        System.out.println("================================");
        for (String pet : sList) {  // 특정 부분 출력 불가능 전체 출력할 때만
            System.out.println(pet);
        }

        //list 내부 객체 전체삭제: clear();
        sList.clear();
        System.out.println(sList);
        System.out.println(sList.size());
        System.out.println(sList.isEmpty()); //비어있으면 true

        //java 정렬 부분 자료구조 공부하기

        //DB를 쓸 경우 순서 정렬은 sql에서 순서 정렬하는게 성능상 유리
    }
}
