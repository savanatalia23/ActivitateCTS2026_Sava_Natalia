package DPComportamentale.Strategy.ex1.main;

import DPComportamentale.Strategy.ex1.clase.ProbaOrala;
import DPComportamentale.Strategy.ex1.clase.ProbaScrisa;
import DPComportamentale.Strategy.ex1.clase.Student;

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
