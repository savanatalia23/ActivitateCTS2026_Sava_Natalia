package Observer.Farmacie.clase;

public class Client implements IClient{

    protected  String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void notifica(String mesaj) {
        System.out.println("Clientul " + this.nume + " a primit " + mesaj);
    }
}
