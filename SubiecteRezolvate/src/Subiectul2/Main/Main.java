package Subiectul2.Main;


import Subiectul2.Abonament.Abonament;
import Subiectul2.Abonament.Builder;
import Subiectul2.Receptie.Receptie;
import Subiectul2.Rezervare.Rezervare;

public class Main {
    static void main(String[] args) {
        Builder builder = new Builder();

        Abonament abonament1 = builder.setAccesAntrenor(true).buid();

        System.out.println( abonament1.toString());

        Abonament abonament2 = builder.setTipAbonament("true").setMasaj(true).setNrZile(21).setNrSedinte(3).buid();
        System.out.println( abonament1.toString());
        System.out.println( abonament2.toString());

        Receptie receptie = Receptie.getInstance("Vitan");

        Rezervare rez1 = new Rezervare("Natalia", abonament1);
        Rezervare rez2 = new Rezervare("Bibi", abonament2);
        Rezervare rez3 = new Rezervare("Aron", abonament1);

        receptie.adaugaRezervare(rez1);
        receptie.adaugaRezervare(rez3);
        receptie.adaugaRezervare(rez2);

        System.out.println(receptie.toString());

        Receptie receptie2 = Receptie.getInstance("Baneasa");
        System.out.println("\n" + receptie2.toString());

    }
}
