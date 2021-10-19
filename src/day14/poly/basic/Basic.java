package day14.poly.basic;

//추가 클래스는 public 안 붙임
class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

class Computer {
    // LGMonitor monitor;
    Monitor monitor;
}

class Monitor {
}

class LGMonitor extends Monitor {
}

class HPMonitor extends Monitor {
}


// public 클래스는 이름은 패키지와 같은 이름으로 (하나만)
public class Basic {
    Object x1 = new A();  //*최고위 부모 타입은 Object 타입  모두 가능
    Object x2 = new B();  //*최고위 부모 타입은 Object 타입  모두 가능
    Object x3 = new C();  //*최고위 부모 타입은 Object 타입  모두 가능
    A x4 = new D();       // A타입 B타입 D타입 가능  *최고위 부모 타입은 Object 타입  모두 가능
    A x5 = new E();       // A타입 C타입 E타입 가능  *최고위 부모 타입은 Object 타입  모두 가능

    public static void main(String[] args) {
        Computer com = new Computer();
        com.monitor = new LGMonitor();
        com.monitor = new HPMonitor();

        double[] dArr = {
                5.5, 3.3, 15
        };

        Monitor[] hpMonitors = {
                new HPMonitor()
                , new LGMonitor()
        };

        Object[] arr = {5, 3.14, "hello", new LGMonitor()};

    }
}
