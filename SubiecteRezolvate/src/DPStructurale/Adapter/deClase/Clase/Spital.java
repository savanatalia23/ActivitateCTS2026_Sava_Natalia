package DPStructurale.Adapter.deClase.Clase;

public class Spital implements ISpital{

    private int nr;

    public Spital(int nr) {
        this.nr = nr;
    }

    @Override
    public void afiseazaSpital() {
        System.out.println("Am afisat un obiect de tip SPITAL "+ this.nr);
    }
}
