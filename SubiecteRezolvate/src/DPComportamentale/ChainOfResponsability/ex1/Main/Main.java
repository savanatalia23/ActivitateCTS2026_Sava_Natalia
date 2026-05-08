package DPComportamentale.ChainOfResponsability.ex1.Main;

import DPComportamentale.ChainOfResponsability.ex1.Clase.*;

public class Main {
    static void main(String[] args) {

        Notificare notifiecare= new NotificareManager();
        Notificare notifiecareEmail= new NotificareEmail();
        Notificare notifiecareSMS= new NotificareSms();


        notifiecareSMS.setSuccesor(notifiecareEmail);
        notifiecareEmail.setSuccesor(notifiecare);

        System.out.println(notifiecareSMS.trimiteNotificare(new Client("dadf","4573", "Natalia")));
        System.out.println(notifiecareSMS.trimiteNotificare(new Client(null,"4573", "Maria")));
        System.out.println(notifiecareSMS.trimiteNotificare(new Client()));
        System.out.println(notifiecareSMS.trimiteNotificare(new Client("dadf",null, "Alex")));

    }
}
