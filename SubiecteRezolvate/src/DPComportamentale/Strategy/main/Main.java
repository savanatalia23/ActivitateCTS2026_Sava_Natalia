package DPComportamentale.Strategy.main;

import DPComportamentale.Strategy.clase.ProbaGrila;
import DPComportamentale.Strategy.clase.ProbaOrala;
import DPComportamentale.Strategy.clase.ProbaScrisa;
import DPComportamentale.Strategy.clase.Student;

import javax.print.attribute.standard.MediaSize;

public class Main {
    static void main(String[] args) {

        Student natalia = new Student("Natalia");

        natalia.examinare();
        natalia.setModSustinere(new ProbaScrisa());
        natalia.examinare();
        natalia.setModSustinere(new ProbaOrala());
        natalia.examinare();
    }
}
