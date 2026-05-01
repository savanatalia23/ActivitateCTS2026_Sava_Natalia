package DPCreationale.Builder.Ex2.autobuz;

public class Autobuz {

    protected int capacitate;
    protected String model;
    protected String sofer;

    protected boolean opriri = false;
    protected boolean deschideUsile = false;
    protected String textAfisat = "Nu are text";

    public Autobuz(int capacitate, boolean deschideUsile, String model, boolean opriri, String sofer, String textAfisat) {
        this.capacitate = capacitate;
        this.deschideUsile = deschideUsile;
        this.model = model;
        this.opriri = opriri;
        this.sofer = sofer;
        this.textAfisat = textAfisat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz: ");
        sb.append("capacitate=").append(capacitate);
        sb.append(", model='").append(model).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", opriri=").append(opriri);
        sb.append(", deschideUsile=").append(deschideUsile);
        sb.append(", textAfisat='").append(textAfisat).append('\'');
        return sb.toString();
    }

    public Autobuz(){};

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public boolean isDeschideUsile() {
        return deschideUsile;
    }

    public void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isOpriri() {
        return opriri;
    }

    public void setOpriri(boolean opriri) {
        this.opriri = opriri;
    }

    public String getSofer() {
        return sofer;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public String getTextAfisat() {
        return textAfisat;
    }

    public void setTextAfisat(String textAfisat) {
        this.textAfisat = textAfisat;
    }


}
