package day15.abs;

public class Main {

    public static void main(String[] args) {

        Pet[] pets = {
                new Dog("뽀삐", "진돗개")
                , new Cat("말썽쟁이", "러시안블루")
                , new Tiger("호돌이", "시베리아 호랑이")
        };
        for (Pet pet : pets) {
            System.out.println("=========================");
            pet.inject();
            pet.eat();
        }
        // new Pet(); 추상화 클래스는 인스턴스화 할 수 없음
        // 대신 타입은 쓸 수 있음
        Pet t = new Tiger("호레잉이", "백두산 타이거");
    }
}
