package DPCreationale.Builder.Ex2.NO_DRY_Builder;


import DPCreationale.Builder.Ex2.autobuz.Autobuz;

public class No_Dry_Builder implements Abstract_No_Dry_Builder{

    protected int capacitate;
    protected String model;
    protected String sofer;

    protected boolean opriri = false;
    protected boolean deschideUsile = false;
    protected String textAfisat = "Nu are text";


    public No_Dry_Builder setCapacitate(int capacitate) {
        this.capacitate = capacitate;
        return this;

    }

    public No_Dry_Builder setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
        return this;

    }

    public No_Dry_Builder setModel(String model) {
        this.model = model;
        return this;

    }

    public No_Dry_Builder setOpriri(boolean opriri) {
        this.opriri = opriri;
        return this;

    }

    public No_Dry_Builder setSofer(String sofer) {
        this.sofer = sofer;
        return this;

    }

    public No_Dry_Builder setTextAfisat(String textAfisat) {
        this.textAfisat = textAfisat;
        return this;
    }

    @Override
    public Autobuz build() {
        return new Autobuz(
                this.capacitate,this.deschideUsile, this.model, this.opriri, this.sofer, this.textAfisat
        );
    }
}
