package Strategy.Farmacie.clase;

public class Client {
    protected  String nume;
    protected IModDePlata modalitate ;

    public Client(IModDePlata modalitate, String nume) {
        this.modalitate = modalitate;
        this.nume = nume;
    }

    public void setModalitate(IModDePlata modalitate) {
        this.modalitate = modalitate;
    }

  public void print()
  {
      System.out.println("Clientul cu numele "+ this.nume );
      modalitate.afisareMetoda();
  }
}
