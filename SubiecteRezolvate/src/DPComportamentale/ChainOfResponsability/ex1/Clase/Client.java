package DPComportamentale.ChainOfResponsability.ex1.Clase;

public class Client {
    protected String email;
    protected String nrTel;
    protected String nume;

    public Client(String email, String nrTel, String nume) {
        this.email = email;
        this.nrTel = nrTel;
        this.nume = nume;
    }
    public Client() {
        this.email = null;
        this.nrTel = null;
        this.nume = "Nu are nume";
    }
    public String getEmail() {
        return email;
    }

    public String getNrTel() {
        return nrTel;
    }

    public String getNume() {
        return nume;
    }
}
