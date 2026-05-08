package DPComportamentale.ChainOfResponsability.ex1.Clase;

public abstract class Notificare {
    protected  Notificare succesor;

    public Notificare( ) {
        this.succesor = null;
    }

    public void setSuccesor(Notificare succesor) {
        this.succesor = succesor;
    }

    public abstract String trimiteNotificare(Client client);
}
