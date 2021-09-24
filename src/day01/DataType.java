package day01;

public class DataType {
    public static void main(String[] args) {
        //정수타입
        byte a = 128 - 1;
        short b = 32768 - 1;
        int c = 2147483647;
        //int의 숫자 범위를 초과할 경우 long 타입으로 전환 끝에 L을 붙임
        long d = 20000000000L;
        System.out.println("d = " + d);

        //실수 타입
        float f2 = 132.234567891234F;
        double d2 = 1.234567891234;
        System.out.println("f2 = " + f2);
        
        //문자 타입 (char에서는 한글자만 홑따옴표만)
        char c1 = 'A';
        char c2 =  97;
        System.out.println("c2 = " + c2);

        String s1 = "hey!";
        String s2 = "my name is Ho~~~";
        System.out.println(s1 + s2);

        String msg = "여기는 아주 \"위험해\"!!";
        System.out.println("msg = " + msg);

    }
}
