package DPCreationale.Builder.Ex2.main;


import DPCreationale.Builder.Ex2.Dry_Builder.DRYBuilder;
import DPCreationale.Builder.Ex2.NO_DRY_Builder.No_Dry_Builder;
import DPCreationale.Builder.Ex2.autobuz.Autobuz;

public class Main {
    static void main(String[] args) {
        DRYBuilder builder = new DRYBuilder();

        Autobuz autobuz1 = builder.build();
        System.out.println(autobuz1.toString());

        Autobuz autobuz = builder.setCapacitate(20).setModel("BMW").build();
       // System.out.println(autobuz1.toString());
        System.out.println(autobuz.toString());

        No_Dry_Builder builderNO = new No_Dry_Builder();
        Autobuz autobuz2 = builderNO.setCapacitate(20).setModel("Audi").setOpriri(true).build();
        System.out.println(autobuz2.toString());


    }
}
