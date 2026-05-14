package Strategy.Farmacie.clase;

public class Cash implements IModDePlata{

    protected int suma;

    public Cash(int suma) {
        this.suma = suma;
    }

    @Override
    public void afisareMetoda() {
        System.out.println("Mai aveti disponibili cash" +this.suma + " lei\n");
        suma = suma - 5;    }
}
