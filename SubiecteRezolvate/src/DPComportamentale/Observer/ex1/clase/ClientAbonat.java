package DPComportamentale.Observer.ex1.clase;

public class ClientAbonat  implements IClient{

    protected String nume;

    public ClientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println("CLientul cu numele " +this.nume+ " a primit notificarea: " + mesaj);
    }
}
