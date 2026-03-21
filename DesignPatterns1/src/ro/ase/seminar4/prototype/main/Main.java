package ro.ase.seminar4.prototype.main;

import ro.ase.seminar4.prototype.clase.Rezervare;

public class Main {
    static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Natalia", 15, 2, "1234567899876543");
        Rezervare rezervare1 = (Rezervare) rezervare.copiaza();

        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());

        rezervare1.setOra(20);

        System.out.println(rezervare1.toString());

    }
}
