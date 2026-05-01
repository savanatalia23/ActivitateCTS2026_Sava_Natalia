package Subiectul3.Main;


import Subiectul3.Clase.IPrototype;
import Subiectul3.Clase.ModulAI;

public class Main {
    static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        ModulAI model1 = new ModulAI(" Versiunea 1", 30, 5);
        ModulAI model2 = new ModulAI(" Versiunea 2", 34, 10);
        IPrototype model3 = model1.clone();
        IPrototype model4 = model1.clone();


        System.out.println(model3.toString());

        ((ModulAI)model3).setCostDezvoltare(15);
        System.out.println(model3.toString());

        System.out.println(model2.toString());
        System.out.println(model1.toString());
        System.out.println(model4.toString());

        System.out.println("\n--- Testare reguli în context ---");
        String contextCurent = "Obstacol la 2 metri";

        ((ModulAI)model3).applyRule(0, contextCurent);
        ((ModulAI)model2).applyRule(1, "Baterie sub 10%");

        System.out.println(model3);
        System.out.println(model2);


    }
}
