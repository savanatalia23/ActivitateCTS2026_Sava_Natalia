package DPStructurale.Decorater.Clase;

public abstract class AbstractFelicitare implements IBilet{

    IBilet bilet;

    public AbstractFelicitare(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public String printeza() { return bilet.printeza();}

    public abstract void adaugaMesaj();
}
