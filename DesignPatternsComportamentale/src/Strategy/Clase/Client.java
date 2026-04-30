package Strategy.Clase;

public class Client {
    private String nume;
    private ModalitateDePlata modalitateDePlata;

    public Client(String nume) {
        this.nume = nume;
        this.modalitateDePlata = new Card();
    }

    public void setModalitateDePlata(ModalitateDePlata modalitateDePlata) {
        this.modalitateDePlata = modalitateDePlata;
    }

    public void platesteTranzactie(double suma){
        modalitateDePlata.plateste(this.nume, suma);
    }
}
