package DPStructurale.Strategy.ex1.clase;

public class SMS implements TipDePlata {

    private double tarif;
    private String numar;

    public SMS(String numar, double tarif) {
        this.numar = numar;
        this.tarif = tarif;
    }
    public SMS() {
        this.numar = "1234";
        this.tarif = 2.00;
    }


    @Override
    public void plateste() {
        System.out.println("S-a efectuat cu succes plata prin SMS a " + this.tarif + " lei la numarul " +this.numar);


    }
}
