package day15.abs;

public class Dog extends Pet{

    //Pet 기본생성자가 없을 시 에러 이부분 공부

    public Dog(String name, String kind) {

        super("", "");
    }

    public void inject() {
        System.out.println("멍멍이는 결핵주사를 맞아요~");
    }
    public void eat() {
        System.out.println("멍멍이는 고기를 사료로 먹어요~");
    }

    @Override
    public void play() {
        System.out.println("강아지는 산책하고 놀아요~");
    }

}
