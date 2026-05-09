package DPComportamentale.Strategy.ex2.clase;

public class CardBancar implements TipDePlata {

    private String banca;

    public CardBancar(String banca) {
        this.banca = banca;
    }

    public CardBancar( ) {
        this.banca = "Revolut";
    }

    @Override
    public void plateste() {
        System.out.println("S-a efectuat plata cu Cardul Bancar la banca " + this.banca);
    }
}
