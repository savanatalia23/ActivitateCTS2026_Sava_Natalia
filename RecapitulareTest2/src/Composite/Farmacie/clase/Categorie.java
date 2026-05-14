package Composite.Farmacie.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Structura{

    protected String nume;

    protected List<Structura> listaSubCategorii;

    public Categorie(String nume) {
        this.nume = nume;
        this.listaSubCategorii = new ArrayList<>();
    }
    public void adaugaCat(Structura str){
        listaSubCategorii.add(str);
    }

    public void stergeCat(Structura str)
    {
        listaSubCategorii.remove(str);
    }

    @Override
    public void afisaredetalii(String spatii) {
        System.out.println(spatii + " categorie " + this.nume);
        for(Structura str :listaSubCategorii)
            str.afisaredetalii(spatii+ "   ");
    }
}
