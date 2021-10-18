package day13.static_;

public class Count {

    public int x;  //인스턴스 필드

    public static int y;  //스태틱(정적) 필드 (static(정적) <-> dynamic(동적)) *객체가 아닌 클래스에


    //instance 메서드
    public void m1() {
        System.out.println("x: " + x);
    }

    //static(정적) 메서드
    public static void m2() {
        //System.out.println("x: " +x);
        System.out.println("y: " + y);
    }

}
