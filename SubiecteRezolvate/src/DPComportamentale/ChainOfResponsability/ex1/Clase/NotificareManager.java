package DPComportamentale.ChainOfResponsability.ex1.Clase;

public class NotificareManager extends Notificare{

    public NotificareManager() {
        super();
    }

    @Override
    public String trimiteNotificare(Client client) {
        return "Nu avem date despre client";
    }
}
