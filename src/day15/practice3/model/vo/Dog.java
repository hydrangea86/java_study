package day15.practice3.model.vo;

public class Dog extends Animal{

    public final static String PLACE = "애견카페";
    private int weight;

    public Dog() {

    }

    public Dog(String name, String kinds, int weight) {
        super(name, kinds);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    @Override
    public void speak() {
        String result = super.toString();
        System.out.printf("%s 몸무게는 %dkg 입니다.\n", result, weight);

        //System.out.println(super.toString() + " 몸무게는 " + weight + "kg 입니다.");
    }
}
