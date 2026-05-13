package Flweight.ex1.clase;

public class Client implements IClient {
    protected String nume;
    protected String telefon;
    protected String email;

    protected Client(String email, String nume, String telefon) {
        this.email = email;
        this.nume = nume;
        this.telefon = telefon;
    }

    @Override
    public void rezerva(Rezervare rezervare) {
        System.out.println("Clientul " + this.nume + " are " + rezervare.toString());
    }
}
