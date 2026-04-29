package Composite.Main;

import Composite.Clase.Departament;
import Composite.Clase.Sectie;
import Composite.Clase.Structura;

import java.lang.invoke.SwitchPoint;

public class Main {
    static void main(String[] args) {

        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");
        Structura sectieSecretariat = new Sectie(2, "Secretariat");
        Structura sectieManagement = new Sectie(3, "Management");

        ((Departament)depSpital).adaugaStructura(depAdministrativ);
        ((Departament)depSpital).adaugaStructura(sectieManagement);
        ((Departament)depAdministrativ).adaugaStructura(sectieSecretariat);

        depSpital.afiseazaDetaliiStructura("");

        ((Departament)depSpital).stergeStructura(sectieManagement);
        ((Departament)depAdministrativ).adaugaStructura(sectieManagement);

        System.out.println("\nDupa modificare:\n");

        depSpital.afiseazaDetaliiStructura("");


    }
}
