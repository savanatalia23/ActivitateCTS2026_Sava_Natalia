package DPStructurale.FlyWeight.ex1.Clase;

public class Autobuz {

    protected String mode;
    protected int anFabricatie;
    protected int nrLocuri;

    public Autobuz(int anFabricatie, String mode, int nrLocuri) {
        this.anFabricatie = anFabricatie;
        this.mode = mode;
        this.nrLocuri = nrLocuri;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public String getMode() {
        return mode;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("autobuzul ");
        sb.append("fabricat in anul ").append(anFabricatie);
        sb.append(" este ").append(mode).append('\'');
        sb.append("si are un nr de locuri de ").append(nrLocuri+ "\n");
        return sb.toString();
    }
}
