package Observer.main;


import Observer.clase.ISpital;
import Observer.clase.Pacient;
import Observer.clase.PaientAbonat;
import Observer.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PaientAbonat("Ionescu" , 30);
        Pacient pacient2 = new PaientAbonat("Popescu" , 34);
        Pacient pacient3 = new PaientAbonat("Antonescu" , 35);
        Pacient pacient4 = new PaientAbonat("Alxandrescu" , 54);

        ISpital spital = new Spital("Regina Maria");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);
        spital.aboneazaPacient(pacient4);

        ((Spital)spital).notificareEpidemie();
        System.out.printf("------------------------------------\n");
        ((Spital)spital).notificareVirus();

    }
}