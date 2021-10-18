package day13.final_;

public class Main {
    public static void main(String[] args) {

        Korean kim = new Korean("김철수", "810101-1234567");
        kim.name = "김바보";
//        kim.sid = "12344";
//        kim.nation = "미국";
        Korean park = new Korean("박영희", "810202-2134567");

        System.out.println(park.toString());

        System.out.println(kim.toString());

    }
}
