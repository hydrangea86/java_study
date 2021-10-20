package day15.practice3.model.vo;

public class Cat extends Animal{

    private String location;
    private String color;

    public Cat() {

    }

    public Cat(String name, String kinds, String location, String color) {
        super(name, kinds);
        this.location = location;
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void speak() {
        String result = super.toString();
        System.out.printf("%s %s에 서식하며, 색상은 %s입니다.\n", result, location, color);

        //System.out.println(super.toString() + location + " 에 서식하며, 색상은  "+ color + "입니다.");
    }

}
