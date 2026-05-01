package Subiectul2.Abonament;

public class Builder implements AbstractBuilder{

    Abonament abonament;
    protected String tipAbonament;
    protected boolean accesClaseDeGrup;
    protected boolean accesAntrenor;
    protected int nrSedinte;
    protected int nrZile;
    protected boolean nutritionist ;
    protected boolean masaj ;

    public Builder() {
        abonament = new Abonament(); }

    public Builder setAccesAntrenor(boolean accesAntrenor) {
        this.abonament.setAccesAntrenor( accesAntrenor);
        return this;
    }

    public Builder setAccesClaseDeGrup(boolean accesClaseDeGrup) {
        this.abonament.setAccesClaseDeGrup(accesClaseDeGrup);
        return this;

    }

    public Builder setMasaj(boolean masaj) {
        this.abonament.setMasaj(masaj);
        return this;

    }

    public Builder setNrSedinte(int nrSedinte) {
        this.abonament.setNrSedinte(nrSedinte);
        return this;

    }

    public Builder setNrZile(int nrZile) {
        this.abonament.setNrZile(nrZile);
        return this;

    }

    public Builder setNutritionist(boolean nutritionist) {
        this.abonament.setNutritionist(nutritionist);
        return this;

    }

    public Builder setTipAbonament(String tipAbonament) {
        this.abonament.setTipAbonament( tipAbonament);
        return this;
    }

    @Override
    public Abonament buid() {
        return this.abonament;
    }
}
