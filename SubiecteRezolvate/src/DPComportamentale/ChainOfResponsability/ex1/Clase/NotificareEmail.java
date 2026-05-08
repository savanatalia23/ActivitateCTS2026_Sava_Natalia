package DPComportamentale.ChainOfResponsability.ex1.Clase;

public class NotificareEmail extends Notificare{

    public NotificareEmail() {
        super();
    }

    @Override
    public String trimiteNotificare(Client client) {
        if(client.getEmail() != null)
        {
            return "Clientul " + client.getNume()+ " a primit notificare prin Email" ;
        }
        return super.succesor.trimiteNotificare(client);
    }
}
