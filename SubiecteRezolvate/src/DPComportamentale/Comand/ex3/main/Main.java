package DPComportamentale.Comand.ex3.main;

import DPComportamentale.Comand.ex3.clase.*;


public class Main {
    static void main(String[] args) {
        Operator operator = new Operator();
        Medic medic1 = new Medic("Natalia", "Cardiolog");
        Medic medic2 = new Medic("Edward", "Neurolog`");
        Pacient pacient1 = new Pacient("Alex", 21);
        Pacient pacient2 = new Pacient("Mihai", 34);
        Command tratare1 = new Trateaza(medic1,pacient1);
        Command internare1 = new Interneaza(medic2, pacient2);

        operator.adaugaComanda(tratare1);
        operator.adaugaComanda(internare1);
        operator.exeecutaComanda();
        operator.exeecutaComanda();
        operator.exeecutaComanda();
    }
}
