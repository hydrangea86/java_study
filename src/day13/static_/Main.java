package day13.static_;


public class Main {
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.x = 5;
        Count.y = 10;  //static은 클래스 이름으로 설정 (따로 이름 부여 의미 없음)
        System.out.println("c1.x = " + c1.x);
        System.out.println("c1.y = " + c1.y);

        System.out.println("==========================");

        Count c2 = new Count();
        c2.x++;
        Count.y--;
        System.out.println("c2.x = " + c2.x);
        System.out.println("c2.y = " + Count.y);
        System.out.println("c1.y = " + Count.y);

        /**
         *결론: instance x객체의 메모리는 만든수 만큼 (ex: 주민번호)
         *     static y객체는 메모리에 하나(static) (ex: 국적)
         */

        System.out.println("========================");
        Count c3 = new Count();
        c3.y = 100;
        System.out.println("c3.y = " + c3.y);
        System.out.println("c3.x = " + c3.x);

        c1.m1();
        c2.m1();

        //static 메서드는 클래스 이름으로 통일
        Count.m2();
        Count.m2();

        System.out.println("=================================");

        학생 김철수 = new 학생();
        학생 박영희 = new 학생();
        김철수.전공 = "경영학과";
        박영희.전공 = "수학과";

        김철수.전공을물어보다();
        박영희.전공을물어보다();

        System.out.println("====================================");

        학생.국적을물어보다(김철수);
    }
}
