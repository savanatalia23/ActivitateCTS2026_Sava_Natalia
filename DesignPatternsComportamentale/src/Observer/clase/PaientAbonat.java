package Observer.clase;

public class PaientAbonat implements Pacient{
    private String nume;
    private int varsta;

    public PaientAbonat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Pacientul " + this.nume + " a primit mesajul: " + mesaj);


    }
}
