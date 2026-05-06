package Observer.clase;


import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private String nume;
    List<Pacient> listaPacienti ;

    public Spital(String nume) {
        this.nume = nume;
        this.listaPacienti = new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (Pacient pacient:listaPacienti)
        {
            pacient.receptioneazaMesaj(mesaj + " de la spitalul " + this.nume);
        }
    }

    @Override
    public void aboneazaPacient(Pacient pacient) {
         listaPacienti.add(pacient);
    }

    @Override
    public void stergePacient(Pacient pacient) {
        listaPacienti.remove(pacient);
    }

    public void notificareVirus(){
        trimiteMesaj("Exista un virus nou in oras!");
    }
    public void notificareEpidemie(){
        trimiteMesaj("Exista o epidemie noua!");
    }
}
