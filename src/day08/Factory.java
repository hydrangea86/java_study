package day08;

//실행용 클래스
public class Factory {

    public static void main(String[] args) {

        //객체의 생성 (변수 타입은 설계도의 이름(Phone))
        Phone galaxy = new Phone();  //생성자 호출해야함
        System.out.println("galaxy= " + galaxy);

        //객체의 속성과 기능을 참조: 참조연산자. 을 사용
        galaxy.powerOn();
        galaxy.showSpec();

        System.out.println("===========================");
        Phone iPhnoeX = new Phone("iPhoneX");

        iPhnoeX.powerOn();
        iPhnoeX.showSpec();

        System.out.println("===========================");
        Phone s21 = new Phone("갤럭시S21", "blue");

        s21.powerOn();
        s21.showSpec();

        s21.ionBattery = new Battery("로켓");

        System.out.println("s21의 배터리 회사명: " + s21.ionBattery.company);

        //아이폰x의 베터리를 충전
        iPhnoeX.ionBattery.charge();

    }
}
