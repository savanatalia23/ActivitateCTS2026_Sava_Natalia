package ro.ase.seminar2.clase.readers;

import ro.ase.seminar2.clase.Aplicant;
import ro.ase.seminar2.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PupilReader extends AplicantReader{

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNext()) {
           Elev elev = new Elev();
           super.citesteAplicant(input, elev);

            int clasa = input.nextInt();
            elev.setClasa(clasa);

            String tutore = input.next();
            elev.setTutore(tutore);

            elevi.add(elev);
        }

        input.close();
        return elevi;    }
}
