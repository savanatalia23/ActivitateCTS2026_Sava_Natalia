package ro.ase.seminar2.clase.readers;



import ro.ase.seminar2.clase.Angajat;
import ro.ase.seminar2.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader{

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input.hasNext()) {
            Angajat angajat = new Angajat();
            super.citesteAplicant(input,angajat);

            int salariu = input.nextInt();
            angajat.setSalariu(salariu);
            String ocupatie = input.next();
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input.close();
        return angajati;    }
}
