package ChainOfResponsability.main;

import ChainOfResponsability.clase.*;

public class Main {
    static void main(String[] args) {

        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();


        calatorieTroleibuz.setSuccesor(calatorieAutobuz);
        calatorieAutobuz.setSuccesor(calatorieTramvai);
        calatorieTramvai.setSuccesor(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandariCalatorie(2));
        System.out.println(calatorieTroleibuz.recomandariCalatorie(4));
        System.out.println(calatorieTroleibuz.recomandariCalatorie(7));
        System.out.println(calatorieTroleibuz.recomandariCalatorie(20));
    }
}
