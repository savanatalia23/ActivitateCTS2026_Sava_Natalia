package DPStructurale.Composite.Ex1.Clase;

public class Item extends Structura{

    protected int pret;

    public Item(String numeStructura, int pret) {
        super(numeStructura);
        this.pret = pret;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + "Produsul "+ super.numeStructura + " costa " + this.pret+ " lei.");
    }
}
