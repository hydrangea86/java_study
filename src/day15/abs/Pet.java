package day15.abs;

import org.omg.CORBA.PUBLIC_MEMBER;

public abstract class Pet {

    private final String name;
    private final String kind;

    public Pet(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    //상위 클래스 추상 메서드는 필수 기능 조건을 하위 클래스에 오버라이딩 강제됨
    //클래스를 먼저 추상화 하고 메서드를 추상화 함 소괄호() 후 세미콜론; {}중괄호 사용하면 안됌 (클래스랑 메서드만 사용 가능)
    //final이랑 같이 함께 못 씀

    //예방접종을 맞다
    public abstract void inject();

    //사료를 먹다
    public abstract void eat();

    //======================================================================

    //노는 기능
    public void play() {
        System.out.println("애완동물은 혼자서도 잘 놀아요~");
    }

    //그대로 쓸 것
    public final void swim() {
        System.out.println("애완동물은 헤엄치는 걸 좋아해요~");
    }
}
