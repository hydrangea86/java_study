package day19.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetBasic {

    public static void main(String[] args) {
        
        //set(집함개념): 중복 저장 허용 x, 순서없이 저장, 탐색, 저장속도 빠름
        //인터패이스 타입이라 생성 못함
        // Set<String> set = new Set<>(); x
        Set<String> set = new HashSet<>(); 
        
        //set에 객체 추가: add(obj)
        set.add("김말이");
        set.add("닭강정");
        set.add("단무지");
        boolean b1 = set.add("김밥");
        boolean b2 = set.add("김말이");

        int size = set.size();
        System.out.println("size = " + size);
        System.out.println(set);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        
        //set의 반복문
        for (String s : set) { //for each loop (Iterable 인터페이스를 상속받아야 iteration 쓸 수 있음)
            System.out.println("s = " + s);
        }
        //set의 객체 삭제: remove(obj)
        set.remove("단무지");
        System.out.println(set);

        //전체 삭제
        set.clear();
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
