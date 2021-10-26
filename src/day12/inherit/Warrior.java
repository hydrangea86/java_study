package day12.inherit;

public class Warrior extends Player {

    public int rage;

    public Warrior() {
//      super(); 부모의 기본생성자 호출 자동 숨김(부모객체 두개 생성)
        this("노네임");
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
    public void fireSlash(Player target) {
        System.out.printf("%s님이 %s님에게 FireSlash를 시전했습니다!\n"
                , this.name, target.name);
        int damage;
        String job;
        if (target instanceof Warrior) {
            damage = 10;
            job = "전사";
        } else if (target instanceof Mage) {
            damage = 20;
            job = "마법사";
        } else if (target instanceof Hunter) {
            damage = 15;
            job = "사냥꾼";
        } else {
            damage = 0;
            job = "미확인";
        }
        target.hp -= damage;
        System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n"
                , target.name, job, damage);
        System.out.printf("%s님의 현재 체력: %d\n"
                , target.name, target.hp);
        System.out.println();


        /**
         "====================================나의 해설============================================="
         if (character instanceof Mage) {
         int attackPower = 20;
         System.out.println(this.name + "님이 " + character.name + "에게 FireSlash를 시전했습니다!");
         System.out.println(character.name + "(마법사)님이 " + attackPower + "의 피해를 입었습니다.");
         System.out.println(character.name + "님의 현재 체력: " + (character.hp - attackPower));
         } else if (character instanceof Hunter) {
         int attackPower = 15;
         System.out.println(this.name + "님이 " + character.name + "에게 FireSlash를 시전했습니다!");
         System.out.println(character.name + "(사냥꾼)님이 " + attackPower + "의 피해를 입었습니다.");
         System.out.println(character.name + "님의 현재 체력: " + (character.hp - attackPower));
         } else if (character instanceof Warrior) {
         int attackPower = 10;
         System.out.println(this.name + "님이 " + character.name + "에게 FireSlash를 시전했습니다!");
         System.out.println(character.name + "(전사)님이 " + attackPower + "의 피해를 입었습니다.");
         System.out.println(character.name + "님의 현재 체력: " + (character.hp - attackPower));
         }
         */

    }
}
