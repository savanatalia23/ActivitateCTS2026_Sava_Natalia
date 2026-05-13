package Composite.ex1.clase;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Structura {

    List<Structura> listaSubfoldere;

    public Folder(String nume) {
        super(nume);
        listaSubfoldere = new ArrayList<>();
    }

    public void adaugaSubFolder(Structura subFolder) {
        listaSubfoldere.add(subFolder);
    }

    public void stergereubFolder(Structura subFolder) {
        listaSubfoldere.remove(subFolder);
    }

    @Override
    public void afisare(String spatii) {
        System.out.println(spatii + "Nume: " + this.nume);
        for(Structura str:listaSubfoldere)
        {
            str.afisare(spatii + "   ");
        }
    }
}
