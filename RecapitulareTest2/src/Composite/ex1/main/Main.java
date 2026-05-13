package Composite.ex1.main;

import Composite.ex1.clase.Fisier;
import Composite.ex1.clase.Folder;
import Composite.ex1.clase.Structura;

public class Main {
    static void main(String[] args) {
        Structura f1 = new Folder("Header");
        Structura f4 = new Folder("Folder4");
        Structura f3 = new Folder("Folder3");
        Structura f2 = new Folder("Folder2");
        Structura f5 = new Fisier("Fisier1");
        Structura f6 = new Fisier("Fisier2");
        Structura f7 = new Fisier("Fisier3");

        ((Folder)f1).adaugaSubFolder(f2);
        ((Folder)f1).adaugaSubFolder(f5);
        ((Folder)f2).adaugaSubFolder(f4);
        ((Folder)f2).adaugaSubFolder(f6);
        ((Folder)f2).adaugaSubFolder(f3);
        ((Folder)f3).adaugaSubFolder(f7);

        f1.afisare(" ");
    }
}
