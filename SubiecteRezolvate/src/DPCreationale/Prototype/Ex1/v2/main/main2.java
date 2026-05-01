package DPCreationale.Prototype.Ex1.v2.main;


import DPCreationale.Prototype.Ex1.v2.clase.Autobuz2;
import DPCreationale.Prototype.Ex1.v2.clase.MijlocDeTransport2;

public class main2 {
    static void main() {
        Autobuz2 autobuz1 = new Autobuz2("21", 30, "Transport Ilfov", "Mercedes" );
        Autobuz2 autobuz2 = (Autobuz2) autobuz1.copiaza();
        System.out.println(autobuz1);
        System.out.println(autobuz2);
        autobuz2.setDenumireLinie("45");
        System.out.println(autobuz2 + "\n");

        MijlocDeTransport2 autobuz12 = new Autobuz2("50", 30, "Transport Voluntari", "BMW" );
        MijlocDeTransport2 autobuz22 = autobuz12.copiaza();
        System.out.println(autobuz12);
        System.out.println(autobuz22);
        ( (Autobuz2) autobuz22).setDenumireLinie("45");
        System.out.println(autobuz22);

    }
}
