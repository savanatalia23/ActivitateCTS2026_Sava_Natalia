package DPCreationale.Builder.Ex1.Main;


import DPCreationale.Builder.Ex1.Builder.DRY.Builder_DRY;
import DPCreationale.Builder.Ex1.Builder.NoDry.Builder_No_Dry;
import DPCreationale.Builder.Ex1.Rezervare.Rezervare;

public class Main {
    public static void main(String[] args) {

        Builder_No_Dry builder_no_dry = new Builder_No_Dry();
        Rezervare rezervare1 = builder_no_dry.setDenumireEveniment("Club One").setDecoratiuneMasa(true).setDecoratiuneMasa(false).build();
        System.out.println(rezervare1.toString());

        Builder_DRY builderDry = Builder_DRY.getInstantaBuilderDry();
        Rezervare rezervare2 = builderDry.setDenumireEveniment("BOA").setDecoratiuneMasa(true).setDecoratiuneMasa(false).buid("RockCafe");

        System.out.println(rezervare2.toString());

        Rezervare rezervare3 = builderDry.setScaunErgonomic(true).buid("Beraria");

        System.out.println(rezervare3.toString());
    }
}

