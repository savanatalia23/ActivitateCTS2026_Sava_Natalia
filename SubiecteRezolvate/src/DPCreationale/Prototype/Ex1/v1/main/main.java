package DPCreationale.Prototype.Ex1.v1.main;


import DPCreationale.Prototype.Ex1.v1.clase.Autobuz;
import DPCreationale.Prototype.Ex1.v1.clase.MijlocDeTransport;

public class main {
    static void main(String[] args) {

//        Autobuz autobuz1 = new Autobuz("21", 30, "Transport Ilfov", "Mercedes" );
//        Autobuz autobuz2 = (Autobuz) autobuz1.copiaza();
//        System.out.println(autobuz1);
//        System.out.println(autobuz2);
//        autobuz2.setDenumireLinie("45");
//        System.out.println(autobuz2);

//        ITransport autobuz1 = new Autobuz("21", 30, "Transport Ilfov", "Mercedes" );
//        ITransport autobuz2 = autobuz1.copiaza();
//        System.out.println(autobuz1);
//        System.out.println(autobuz2);
//        ( (Autobuz) autobuz2).setDenumireLinie("45");
//        System.out.println(autobuz2);

        MijlocDeTransport autobuz1 = new Autobuz("21", 30, "Transport Ilfov", "Mercedes" );
        MijlocDeTransport autobuz2 = autobuz1.copiaza();
        System.out.println(autobuz1);
        System.out.println(autobuz2);
        autobuz2.setDenumireLinie("45");
        System.out.println(autobuz2);

    }
}
