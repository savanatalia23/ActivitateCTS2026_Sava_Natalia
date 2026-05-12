package Observer.ex1.clase;

public class ClientAbonat implements IClient {

    protected String nume;
    protected int pret;

    public ClientAbonat(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Clientul " + this.nume+ " are de platit " + this.pret);
    }

    @Override
    public void notifica(String mesaj) {
        System.out.println(mesaj);
    }
}
