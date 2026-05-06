package Command.main;

import Command.clase.Operator;
import Command.clase.Pacient;
import Command.clase.comenzi.Command;
import Command.clase.comenzi.Internare;
import Command.clase.comenzi.Tratare;
import Command.clase.personalSpital.Asistenta;
import Command.clase.personalSpital.Medic;
import Command.clase.personalSpital.PersonalSpital;

public class main {
    public static void main(String[] args) {

        PersonalSpital medic = new Medic("Natalia");
        PersonalSpital asistenta = new Asistenta("Andreea");

        Pacient pacient1= new Pacient("Philipe");
        Pacient pacient2 = new Pacient("Alex");

        Command comanda1= new Internare(medic, pacient1);
        Command comanda2= new Tratare(asistenta, pacient2);

        Operator operator = new Operator();

        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

        operator.inregistreaza(new Tratare( asistenta, new Pacient("Gigel")));
        operator.executaComanda();

    }
}
