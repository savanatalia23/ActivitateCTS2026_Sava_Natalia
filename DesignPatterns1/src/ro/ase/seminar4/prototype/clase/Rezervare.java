package ro.ase.seminar4.prototype.clase;

public class Rezervare implements IRezervare{

    protected String numeClient;
    protected int ora;
    protected  int nrPersoane;
    protected String nrCard;

    public Rezervare(String numeClient, int ora, int nrPersoane, String nrCard) {
        this.numeClient = numeClient;
        if (ora>= 11 &&  ora<= 22){
            this.ora = ora;

        }
        else{
            this.ora=11;
        }
        this.nrPersoane = nrPersoane;

        if(nrCard.length()== 16){
            this.nrCard = nrCard;
        }
        else{
            this.nrCard = "0000000000000000";
        }
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setNrCard(String nrCard) {
        this.nrCard = nrCard;
    }

    private Rezervare() { }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare: ");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", nrCard='").append(nrCard).append('\'');
        return sb.toString();
    }

    @Override
    public IRezervare copiaza() {


            Rezervare rezervare  = new Rezervare();
            rezervare.ora = this.ora;
            rezervare.nrCard = this.nrCard;
            rezervare.nrPersoane = this.nrPersoane;
            rezervare.numeClient = this.numeClient;

            return rezervare;
    }
}
