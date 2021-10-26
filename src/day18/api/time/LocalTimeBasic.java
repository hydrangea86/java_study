package day18.api.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeBasic {

    public static void main(String[] args) {
        
        //날짜 정보 제어
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);
        
        //임의의 날짜정보 생성
        LocalDate targetDate = LocalDate.of(2022, 5, 4);
        System.out.println("targetDate = " + targetDate);
        
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        LocalTime targetTime = LocalTime.of(20, 0, 3);
        System.out.println("targetTime = " + targetTime);
        
        //날짜와 시간정보 제어
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        
        //현재 시간의 밀리초(유닉스 타임) / Ms = 1/1000, Ns = 1/1000000000
        // 1970-0101 00:00:00(컾퓨터가 시간을 계산하는 기준)를 기준으로 현재까지 흘러간 시간의 단위(밀리초)
        long nowTimeMs = System.currentTimeMillis();
        System.out.println("nowTimeMs = " + nowTimeMs); //Ms 뒤에 세개 숫자 제외한 후 숫자부터 초
        
        //각 날짜와 시간 정보 추출
        int year = now.getYear(); //단축키 Ctrl + Alt + v (메서드 변수 자동 대입 설정)
        System.out.println("year = " + year);
        
        int monthValue = now.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);

        String weekDay;
        switch (dayOfWeek) {
            case MONDAY: weekDay = "월요일";
                System.out.println(weekDay);
            break;
            case TUESDAY: weekDay = "화요일";
                System.out.println(weekDay);
            break;
        }
    }
}
