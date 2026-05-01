package DPCreationale.STBBuilder.main;


import DPCreationale.STBBuilder.builder.AutobuzBuilder;
import DPCreationale.STBBuilder.builder.AutobuzLinie;

public class Main {
    static void main(String[] args) {

        AutobuzBuilder builder = new AutobuzBuilder("Mercedes", "Natalia");
        AutobuzLinie a3 = builder.build();
        System.out.println(a3.toString());
        AutobuzLinie a1 = builder.setModel("BMW").setCapacitate(21).build();
        AutobuzLinie a2 = builder.setModel("Audi").build();
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
