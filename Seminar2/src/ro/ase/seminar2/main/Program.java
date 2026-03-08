package ro.ase.seminar2.main;


import ro.ase.seminar2.clase.Aplicant;
import ro.ase.seminar2.clase.readers.AngajatReader;
import ro.ase.seminar2.clase.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        try {
            AplicantReader ra = new AngajatReader("angajati.txt");
            listaAplicanti = ra.readAplicanti();
            for (Aplicant aplicant : listaAplicanti) {
                System.out.println(aplicant.toString());
                aplicant.afisareVenit();
                aplicant.afiseazaStatut();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
