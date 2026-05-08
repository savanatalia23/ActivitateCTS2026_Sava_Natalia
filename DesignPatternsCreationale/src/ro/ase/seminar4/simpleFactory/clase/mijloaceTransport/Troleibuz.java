package ro.ase.seminar4.simpleFactory.clase.mijloaceTransport;

public class Troleibuz implements MijloaceTransport{
    private int nrLinie;
    private String marca;

    public Troleibuz (int nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afisareTipTransport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Troleibuzul de pe linia  ").append(this.nrLinie).append(" este produs de  ").append(this.marca);
        System.out.println(sb.toString());
    }
}
