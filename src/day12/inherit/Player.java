package day12.inherit;

public class Player extends Object { // extends Object 안써도 자동으로 숨김(object 최상위)
    //다중 상속은 자바에서 기본적으로 막아 놓음

    public String name;
    public int level;
    public int hp;

    public Player() {
        System.out.println("Player 객체 생성됨!");
    }

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 50;
    }

    public void info() {
        System.out.println("======= 캐릭터 정보 =======");
        System.out.println("# 아이디: " + name); //this.name (this생략)
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }
    public void attack() {
        System.out.println(name + "님이 공격합니다.");
    }

}
