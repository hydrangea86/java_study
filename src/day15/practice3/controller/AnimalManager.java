package day15.practice3.controller;

import day15.practice3.model.vo.Animal;
import day15.practice3.model.vo.Cat;
import day15.practice3.model.vo.Dog;

public class AnimalManager {
    public static void main(String[] args) {

        Animal[] arrary = new Animal[5];
        arrary[0] = new Dog("바둑이", "말티즈", 5);
        arrary[1] = new Cat("극동이", "코숏", "인천", "검+흰");
        arrary[2] = new Dog("너울이", "슈나우저", 9);
        arrary[3] = new Cat("초코", "코숏", "서울", "갈색");
        arrary[4] = new Cat("망고", "코숏", "인천", "노란색");

        for (int i = 0; i < arrary.length; i++) {
            arrary[i].speak();
        }
    }
}
