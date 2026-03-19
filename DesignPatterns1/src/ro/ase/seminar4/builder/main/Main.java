package ro.ase.seminar4.builder.main;


import ro.ase.seminar4.builder.clase.Internare;
import ro.ase.seminar4.builder.clase.InternareBuilder;
import ro.ase.seminar4.builder.clase.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello seminar05");
        Internare internare = new Internare(true,false,true,true, "Mihai Popovici");
        Internare internare2 = new Internare(false,false,false,false, "Ana-Maria Anghel");
        InternareBuilder builder = new InternareBuilder("Anne-Marie");
        Internare internare3 = builder.build();
        Internare internare4 = builder.setNumePacient("Traian Basescu").setPatRabatabil(true).setPapuci(true).setHalat(true).build();
        System.out.println(internare.toString());
        System.out.println(internare2.toString());
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());


        //alternativ
        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ();
        builderAlternativ.setMicDejun(true);
//        Internare internare101 = builderAlternativ.build();
//        Internare internare102 = builderAlternativ.setNumePacient("Nicusor Dan").build();
//        Internare internare103 = builderAlternativ.setNumePacient("Philipe Soueidan").build();

        Internare internare101 = builderAlternativ.build("Nicolae Ceausescu");
        Internare internare102 = builderAlternativ.build("Boc face Poc");
        Internare internare103 = builderAlternativ.build("Francois Pierre");
        Internare internare104 = builderAlternativ.build("Winston Churchill");


        System.out.println(internare101.toString());
        System.out.println(internare102.toString());
        System.out.println(internare103.toString());
        System.out.println(internare104.toString());
    }

}
