package DPStructurale.Decorater.Clase;

public class FelicitareAnNou extends AbstractFelicitare {

    public FelicitareAnNou(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void adaugaMesaj() {
        System.out.println("An nou fericit pentru " + bilet.printeza());
    }
}
