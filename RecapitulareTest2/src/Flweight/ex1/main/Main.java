package Flweight.ex1.main;

import Flweight.ex1.clase.Client;
import Flweight.ex1.clase.IClient;
import Flweight.ex1.clase.RegistruClienti;
import Flweight.ex1.clase.Rezervare;

public class Main {
    static void main(String[] args) {


        RegistruClienti lista = new RegistruClienti();

        lista.getClient("Natalia", "0937829382", "jfrveuj").rezerva(new Rezervare("32", "3", "12:00"));
        lista.getClient("Andreea", "64397843", "ygdycfg").rezerva(new Rezervare("21", "3", "19:00"));
    }
}
