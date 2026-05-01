package DPCreationale.Builder.Ex2.Dry_Builder;


import DPCreationale.Builder.Ex2.autobuz.Autobuz;

public class DRYBuilder implements DRY_Builder{

    Autobuz autobuz;

    private int capacitate;
    private String model = "Fara";
    private String sofer = "Fara";

    private boolean opriri = false;
    private boolean deschideUsile = false;
    private String textAfisat = "fara";

    public DRYBuilder() { this.autobuz = new Autobuz();   }

    public int getCapacitate() {
        return capacitate;
    }

    public DRYBuilder setCapacitate(int capacitate) {
        this.autobuz.setCapacitate(capacitate);
        return this;
    }

    public boolean isDeschideUsile() {
        return deschideUsile;
    }

    public DRYBuilder setDeschideUsile(boolean deschideUsile) {
        this.autobuz.setDeschideUsile(deschideUsile);
        return this;
    }

    public String getModel() {
        return model;
    }

    public DRYBuilder setModel(String model) {
        this.autobuz.setModel(model);
        return this;
    }

    public boolean isOpriri() {
        return opriri;
    }

    public DRYBuilder setOpriri(boolean opriri) {
        this.autobuz.setOpriri(opriri);
        return this;
    }

    public String getSofer() {
        return sofer;
    }

    public DRYBuilder setSofer(String sofer) {
        this.autobuz.setSofer(sofer);
        return this;
    }

    public String getTextAfisat() {
        return textAfisat;
    }

    public DRYBuilder setTextAfisat(String textAfisat) {
        this.autobuz.setTextAfisat(textAfisat);
        return this;
    }

    @Override
    public Autobuz build() {
        return this.autobuz;
    }
}
