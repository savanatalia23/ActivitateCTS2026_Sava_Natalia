package DPStructurale.Adapter.deObiecte.Clase;

public class Spital  {

    private int nr;

    public Spital(int nr) {
        this.nr = nr;
    }

    public void afiseazaSpital() {
        System.out.println("Am afisat un obiect de tip SPITAL "+ this.nr);
    }
}
