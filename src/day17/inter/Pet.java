package day17.inter;

public interface Pet {


    //사료를 먹다
    //자동으로 public abstract 붙음

    //인터페이스에는 상수필드만 선언가능
    int ABC = 100; //앞에 final static 자동생략
    //Dog, Cat Pet 타입 사용 가능
    //객체 생성 못함
    //인터페이스는 기본적으로 추상메서드만 선언할 수 있음.

    void feeding();
}
