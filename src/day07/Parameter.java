package day07;

public class Parameter {

    //랜덤으로 음식하나를 골라서 리턴하는 메서드
    static String chooseRandomFood() {
        String[] foods = {"볶음밥", "치킨", "목살", "파스타"};
        int rn = (int) (Math.random() * foods.length);
        return foods[rn];
    }

    //2개의 정수의 합
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    //n개의 정수의 합
    //static int add(int... nums) //스프레드 문법
    static int add(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        String food = chooseRandomFood();
        System.out.println("food= " + food);

        int result1 = add(10, 20);
        System.out.println("result1 = " + result1);

        //int result = add(5, 10, 15, 20); // 배열 스프레드 문법
        int result = add(new int[] {5, 10, 15, 20});
        System.out.println("result= " + result);
    }
}
