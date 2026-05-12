package DPStructurale.Adapter.deClase.Clase;

public class Adapter extends Farmacie implements ISpital{


    public Adapter(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaSpital() {
        super.afiseazaFarmacie();
    }
}
