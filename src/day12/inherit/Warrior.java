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

    public void fireSlash() {

    }
}
