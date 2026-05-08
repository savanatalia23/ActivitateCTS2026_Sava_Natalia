package DPComportamentale.ChainOfResponsability.ex1.Clase;

public class NotificareSms extends Notificare{

    public NotificareSms() {
        super();
    }

    @Override
    public String trimiteNotificare(Client client) {
        if(client.getNrTel() != null)
        {
            return "Clientul " + client.getNume()+ " a primit notificare prin SMS" ;
        }

        return super.succesor.trimiteNotificare(client);


    }
}
