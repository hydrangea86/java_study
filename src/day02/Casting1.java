package day02;

public class Casting1 {

    public static void main(String[] args) {

        //묵시적 형변환(promotion, upcasting)
        byte a = 100; //1byte

        //byte -> int 묵시적 형변환
        int b = a;   //4byte

        double c = b; //8byte
        System.out.println("c = " + c);
        
        //명시적 형변환 (downcasting)
        int n = 1000;
        byte m = (byte)n;
        System.out.println("m = " + m);
        
        int money = 2000;
        double price = 600.0;
        
        //에러날 시 빨간줄 alt + Enter 참고
        int result = (int) (money / price);
        System.out.println("result = " + result);
        
        char r = 'A';
        int o = r;
        System.out.println("o = " + o);

        short p = (byte) o;
        System.out.println("p = " + p);
    }
}
