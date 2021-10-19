package day14.poly.car;

import day01.StdOutput;
import day10.modi.pac2.C;

public class Main {

    public static void main(String[] args) {

        Car t = new Tucson();
        Car s = new Sonata();
        Car b = new Boxster();

        Car[] cars = {t, s, b, new Tucson(), new Boxster()};
        for (Car c : cars) {
            c.run();
        }
        Driver park = new Driver();
        park.drive(s);
        park.drive(t);
        park.drive(new Sonata());
        park.drive(new Tucson());
        park.drive(new Boxster());

        System.out.println("========================");
        Car myCar = park.buyCar("소나타");
        myCar.run();

        park.buyCar("박스터").run();

        int a = 10;
        double d = a; // 작은 타입에서 큰 타입으로 자동 암묵적 변환

        double dd = 3.5;
        int vv = (int) dd;  //큰 타입에서 작은 타입 변환할 경우 형변환 실행

        Sonata sn = new Sonata();
        Car cc = sn;
        Sonata sss = (Sonata) cc;

        System.out.println("===================================");
        /**
        Car 내소나타 = park.buyCar("소나타");
        ((Sonata) 내소나타).국산세단할인();
         */

        //리턴 타입이 상위일 경우 리턴타입을 다운 캐스팅을 함(하위타입은 상위타입으로 자동 변환 가능하기 때문)
        //(ex. 부모 Car 타입을 상속받은 자식 Sonata 타임으로 다운캐스팅
        Sonata 내소나타 = (Sonata) park.buyCar("소나타");
        내소나타.국산세단할인();
        내소나타.run();

        cars[0] = 내소나타;

        Car car = new Sonata();
        Sonata ssss = (Sonata) car;
        ssss.국산세단할인();


        System.out.println("=================================");
        CarShop shop = new CarShop();
        int money = shop.sellCar(new Sonata());
        System.out.println("money = " + money);
        int money1 = shop.sellCar(t);
        System.out.println("money1 = " + money1);

    }
}
