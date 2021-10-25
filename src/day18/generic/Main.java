package day18.generic;

import day10.modi.pac1.B;

public class Main {
    
    public static void main(String[] args) {
        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();
        System.out.println("apple = " + apple);
        
        PeachBasket pb = new PeachBasket();
        pb.setPeach(new Peach());

        System.out.println("====================================");
        
        /**
        Basket abp = new Basket();
        abp.setFruit(new Apple());
        abp.setFruit(new Peach());
        Apple apple1 = (Apple) abp.getFruit();
        System.out.println("apple1 = " + apple1);
         */
        
        Basket<Apple> abp = new Basket<>();
        abp.setF(new Apple());
        Apple f = abp.getF();
        System.out.println("f = " + f);
        
        Basket<Peach> pcb = new Basket<>();
        pcb.setF(new Peach());
        Peach peach = pcb.getF();
        System.out.println("peach = " + peach);

        //Basket<Water> waterBasket = new Basket<>();
    }
}
