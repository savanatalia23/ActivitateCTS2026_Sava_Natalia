package Strategy.Farmacie.clase;

public class Card implements IModDePlata{
    protected int suma;

    public Card(int suma) {
        this.suma = suma;
    }

    @Override
    public void afisareMetoda() {
        System.out.println("Mai aveti disponibili pe card " +this.suma + " lei\n");
        suma = suma - 5;
    }

}
