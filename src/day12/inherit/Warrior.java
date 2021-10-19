package day12.inherit;

public class Warrior extends Player {

    public int rage;

    public Warrior() {
        //super(); 부모의 기본생성자 호출 자동 숨김(부모객체 두개 생성)
        this("dd");
        System.out.println("Warrior 객체 생성됨!");
    }

    public Warrior(String name) {
        super(name);
        this.rage = 100;
    }

    //자식이 부모보다 더 강한 접근제한 사용 금지 웬만하면 같은 급 부모랑 자식

    @Override //@Override 써주면 Override 제대로 수행했는지 알려줌.
    public void info() {
        super.info();
        /**
         System.out.println("======= 캐릭터 정보 =======");
         System.out.println("# 아이디: " + name); //this.name (this생략)
         System.out.println("# 레벨: " + level);
         System.out.println("# 체력: " + hp);
         */
        System.out.println("# 분노: " + rage);
    }


    //fireSlash를 각 캐릭터에게 시전하기 위해서 모든 캐릭터를 담을 수 있는 타입 설정 부모 타입 player
    public void fireSlash(Player play) {
        if (play instanceof Mage) {
            int attackPower = 20;
            System.out.println(this.name + "님이 " + play.name + "에게 FireSlash를 시전했습니다!");
            System.out.println(play.name + "(마법사)님이 " + attackPower + "의 피해를 입었습니다.");
            System.out.println(play.name + "님의 현재 체력: " + (play.hp - attackPower));
        } else if (play instanceof Hunter) {
            int attackPower = 15;
            System.out.println(this.name + "님이 " + play.name + "에게 FireSlash를 시전했습니다!");
            System.out.println(play.name + "(사냥꾼)님이 " + attackPower + "의 피해를 입었습니다.");
            System.out.println(play.name + "님의 현재 체력: " + (play.hp - attackPower));
        } else if (play instanceof Warrior) {
            int attackPower = 10;
            System.out.println(this.name + "님이 " + play.name + "에게 FireSlash를 시전했습니다!");
            System.out.println(play.name + "(전사)님이 " + attackPower + "의 피해를 입었습니다.");
            System.out.println(play.name + "님의 현재 체력: " + (play.hp - attackPower));
        }
    }
}
