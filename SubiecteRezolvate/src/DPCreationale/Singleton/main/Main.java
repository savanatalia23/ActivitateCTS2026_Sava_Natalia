package DPCreationale.Singleton.main;

import DPCreationale.Singleton.eager.SingeltonEager;
import DPCreationale.Singleton.lazy.SingletonLazy;
import DPCreationale.Singleton.thread.SingletonThread;

public class Main {
    static void main(String[] args) {
        SingletonLazy instanta = SingletonLazy.getInstanta("Natalia", 23);

        SingletonLazy instanta2 = SingletonLazy.getInstanta("Philipe", 21);

        instanta2.setNume("Phillipe");

        System.out.println(instanta2.toString());
        System.out.println(instanta.toString());

        SingletonThread instanta3 = SingletonThread.getInstance("Alex", 30);
        SingletonThread instanta4 = SingletonThread.getInstance("Natalia", 23);

        instanta3.setNume("Natalia");
        instanta3.setPret(90);

        System.out.println(instanta3.toString());
        System.out.println(instanta4.toString());

        SingeltonEager instanta5 =  SingeltonEager.getInstance();
        System.out.println(instanta5.toString());

    }
}
