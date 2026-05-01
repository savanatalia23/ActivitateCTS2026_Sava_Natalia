package Subiectul2.Abonament;

public class Abonament {
    protected String tipAbonament = "Clasic";
    protected boolean accesClaseDeGrup = true;
    protected boolean accesAntrenor = true;
    protected int nrSedinte= 0;
    protected int nrZile = 0;
    protected boolean nutritionist = false;
    protected boolean masaj = false;

    public Abonament(boolean accesAntrenor, boolean accesClaseDeGrup, boolean masaj, int nrSedinte, int nrZile, boolean nutritionist, String tipAbonament) {
        this.accesAntrenor = accesAntrenor;
        this.accesClaseDeGrup = accesClaseDeGrup;
        this.masaj = masaj;
        this.nrSedinte = nrSedinte;
        this.nrZile = nrZile;
        this.nutritionist = nutritionist;
        this.tipAbonament = tipAbonament;
    }

    public Abonament(){};

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Abonament: ");
        sb.append("accesAntrenor=").append(accesAntrenor);
        sb.append(", tipAbonament='").append(tipAbonament).append('\'');
        sb.append(", accesClaseDeGrup=").append(accesClaseDeGrup);
        sb.append(", nrSedinte=").append(nrSedinte);
        sb.append(", nrZile=").append(nrZile);
        sb.append(", nutritionist=").append(nutritionist);
        sb.append(", masaj=").append(masaj + "\n");
        return sb.toString();
    }


    public void setAccesAntrenor(boolean accesAntrenor) {
        this.accesAntrenor = accesAntrenor;
    }

    public void setAccesClaseDeGrup(boolean accesClaseDeGrup) {
        this.accesClaseDeGrup = accesClaseDeGrup;
    }

    public void setMasaj(boolean masaj) {
        this.masaj = masaj;
    }

    public void setNrSedinte(int nrSedinte) {
        this.nrSedinte = nrSedinte;
    }

    public void setNrZile(int nrZile) {
        this.nrZile = nrZile;
    }

    public void setNutritionist(boolean nutritionist) {
        this.nutritionist = nutritionist;
    }

    public void setTipAbonament(String tipAbonament) {
        this.tipAbonament = tipAbonament;
    }
}
