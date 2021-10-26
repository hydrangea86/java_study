package day12.inherit;

public class Knight extends Warrior {

    public Knight() {
        super();
        System.out.println("Knight 객체 생성!");
        this.name = "기사왕";
        this.rage = 100;
    }
    @Override
    public void info() {
        super.info();
        System.out.println("# 분노:" + rage);
    }

}
