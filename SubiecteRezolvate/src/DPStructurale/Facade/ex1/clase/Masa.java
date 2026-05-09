package DPStructurale.Facade.ex1.clase;

public class Masa {
    private int nrMasa;
    private boolean esteLibera;
    private boolean esteDebarasata;
    private boolean areServetele;

    public Masa(boolean areServetele, boolean esteDebarasata, boolean esteLibera, int nrMasa) {
        this.areServetele = areServetele;
        this.esteDebarasata = esteDebarasata;
        this.esteLibera = esteLibera;
        this.nrMasa = nrMasa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa: ");
        sb.append("areServetele=").append(areServetele);
        sb.append(", nrMasa=").append(nrMasa);
        sb.append(", esteLibera=").append(esteLibera);
        sb.append(", esteDebarasata=").append(esteDebarasata);
        sb.append('}');
        return sb.toString();
    }

    public boolean isAreServetele() {
        return areServetele;
    }

    public boolean isEsteDebarasata() {
        return esteDebarasata;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }
}
