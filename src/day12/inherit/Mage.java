package day12.inherit;

public class Mage extends Player{

    public int mana;

    public Mage(String name) {
        super(name);
        this.mana = 60;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 마력: " + mana);
    }

    /**
    public Mage() {
        super();
    }
     기본 생성자 안쓰면 기본 자동 생성
    */

    public void fireball() {

    }

}
