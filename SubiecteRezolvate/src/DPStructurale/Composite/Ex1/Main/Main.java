package DPStructurale.Composite.Ex1.Main;

import DPStructurale.Composite.Ex1.Clase.Componenta;
import DPStructurale.Composite.Ex1.Clase.Item;
import DPStructurale.Composite.Ex1.Clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura meniu = new Componenta("Meniu");
        Structura desert = new Componenta("Desert");
        Structura mainDish = new Componenta("Main Dish");
        Structura papanasi = new Item("papanasi", 21);
        Structura clatite = new Item("clatite", 30);
        Structura vita = new Item("Vita", 50);

        ((Componenta)meniu).adaugaStructura(desert);
        ((Componenta)meniu).adaugaStructura(mainDish);
        ((Componenta)desert).adaugaStructura(clatite);
        ((Componenta)desert).adaugaStructura(papanasi);
        ((Componenta)mainDish).adaugaStructura(vita);

        meniu.afiseazaDetaliiStructura(" ");

    }
}
