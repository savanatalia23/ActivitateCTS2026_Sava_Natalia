package Composite.Farmacie.main;

import Composite.Farmacie.clase.Categorie;
import Composite.Farmacie.clase.Medicament;
import Composite.Farmacie.clase.Structura;

public class Main {
    static void main(String[] args) {
        Structura med1 = new Medicament("Paracetamol", 12);
        Structura med2 = new Medicament("Carmol", 15);
        Structura med3 = new Medicament("Nurofen", 20);
        Structura med4 = new Medicament("Strepsils", 25);

        Structura cat1 = new Categorie("Lista");
        Structura cat5 = new Categorie("Gripa");
        Structura cat2 = new Categorie("Raceala");
        Structura cat3 = new Categorie("Copii");
        Structura cat4 = new Categorie("Adultii");

        ((Categorie)cat1).adaugaCat(cat2);
        ((Categorie)cat1).adaugaCat(cat5);

        ((Categorie)cat2).adaugaCat(cat3);
        ((Categorie)cat5).adaugaCat(cat4);

        ((Categorie)cat3).adaugaCat(med1);
        ((Categorie)cat3).adaugaCat(med2);
        ((Categorie)cat4).adaugaCat(med3);
        ((Categorie)cat4).adaugaCat(med4);



        cat1.afisaredetalii("  ");
    }
}
