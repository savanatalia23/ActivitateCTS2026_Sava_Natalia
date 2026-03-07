package ro.ase.seminar2.clase.readers;


import ro.ase.seminar2.clase.Aplicant;
import ro.ase.seminar2.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader{
    public StudentReader(String numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.numeFisier));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
           Student student = new Student();
           super.citesteAplicant(input, student);

            int an_studii = input.nextInt();
            student.setAn_studii(an_studii);

            String facultate = (input.next()).toString();
            student.setFacultate(facultate);

            studenti.add(student);
        }
        input.close();
        return studenti;    }
}
