package day01;

public class StdOutput {

    public static void main(String[] args) {

        String dog = "멍멍이";
        String cat = "야옹이";

        //println에서 ln을 지울 경우 자동줄개행이 없음
        System.out.print(dog);
        System.out.println(cat);

        int month = 10;
        int day = 3;
        String anni = "개천철";

        System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");

        //정수 %d, 실수: %f, 문자: %s
        //printf는 줄개행이 없음
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
        System.out.println("메롱메롱");

        double saleRate = 0.2532;
        // %f는 소수점 6자리까지 표현합니다.
        System.out.printf("할인비율: %.2f\n", saleRate);
        //뒤에 % 출력 시 %% 두개 붙임
        System.out.printf("할인비율: %.2f%%\n", saleRate * 100);
    }
}
