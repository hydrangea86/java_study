package day18.generic;

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
        Apple a = abp.getF();
        System.out.println("a = " + a);

        System.out.println("=======================");

        Basket<Peach> pcb = new Basket<>();
        pcb.setF(new Peach());
        Peach p = pcb.getF();
        System.out.println("p = " + p);

        //Basket<Water> waterBasket = new Basket<>();
    }
}
