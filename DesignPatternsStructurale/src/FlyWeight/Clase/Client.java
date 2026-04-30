package FlyWeight.Clase;

public class Client implements ClientAbstract{

    private String nume;
    private String nrTelefon;
    private String mail;

    protected Client(String nume, String nrTelefon, String mail) {
        this.mail = mail;
        this.nrTelefon = nrTelefon;
        this.nume = nume;
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println("Clientul " + this.nume + " are numarul de telefon " + this.nrTelefon + " si adresa de email " + this.mail);
        System.out.println(rezervare.toString());
    }

    @Override
    public void plateste(Rezervare rezervare, double taxaPerPersoana) {
        System.out.println("Clientul " + this.nume+ " are de plata " + rezervare.getNrPersoane()*taxaPerPersoana + " lei");
    }
}
