package day01;

public class variable {

    public static void main(String[] args) {

        //변수의 선언 (정적타이핑) 자바스크립트(동적타이핑)
        int score;

        //변수의 초기화
        score = 3;

        //출력 sout
        System.out.println(score);

        int life =50;
        life = 100;

        int triple = score * 3;
        System.out.println("triple = " + triple);
        System.out.println("triple * 3 = " + triple * 3);

        //정수: int, 실수: double, 문자열: String(무조건 곁따옴표 사용)
        String nickName = "쨱짹이";

        //타입에 맞지않는 값은 저장 불가
        //nickName = 100;

        //변수 이름은 중복 선언 불가능
        //double score = 30.5;

        //선언이나 초기화되지 않은 변수는 사용 불가
        //int result;
        //System.out.println(result);

        //특수문자 사용은 $, _

    }



}
