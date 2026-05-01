package Subiectul2.Receptie;


import Subiectul2.Rezervare.Rezervare;

import java.util.ArrayList;
import java.util.List;

public class Receptie {

    public static Receptie instanta;

    protected String locatie;

    protected List<Rezervare> listaRezervari;

    private Receptie( String locatie) {
        this.listaRezervari = new ArrayList<>();
        this.locatie = locatie;
    }

    public static synchronized Receptie getInstance(String  locatie){
        if( instanta== null)
        {
            instanta = new Receptie(locatie);
        }
        return instanta;
    }

    public void adaugaRezervare(Rezervare rezervare){
        listaRezervari.add(rezervare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Receptie: ");
        sb.append("listaRezervari=").append(listaRezervari);
        sb.append(", locatie='").append(locatie).append('\'');

        return sb.toString();
    }
}
