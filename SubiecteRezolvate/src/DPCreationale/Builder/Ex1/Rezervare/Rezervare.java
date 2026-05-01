package DPCreationale.Builder.Ex1.Rezervare;

public class Rezervare {

    protected String eveniment;
    protected String genMuzical;
    protected boolean muzicaPreferata = false;
    protected boolean privelisteGeam= false;
    protected boolean scaunEgronomic= false;
    protected boolean decorareMasa= false;

    public Rezervare(String eveniment, String genMuzical, boolean muzicaPreferata, boolean privelisteGeam, boolean scaunEgronomic, boolean decorareMasa) {
        this.eveniment = eveniment;
        this.genMuzical = genMuzical;
        this.muzicaPreferata = muzicaPreferata;
        this.privelisteGeam = privelisteGeam;
        this.scaunEgronomic = scaunEgronomic;
        this.decorareMasa = decorareMasa;
    }

    public Rezervare(){};

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("eveniment='").append(eveniment).append('\'');
        sb.append(", genMuzical='").append(genMuzical).append('\'');
        sb.append(", muzicaPreferata=").append(muzicaPreferata);
        sb.append(", privelisteGeam=").append(privelisteGeam);
        sb.append(", scaunEgronomic=").append(scaunEgronomic);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append('}');
        return sb.toString();
    }

    public String getEveniment() {
        return eveniment;
    }

    public void setEveniment(String eveniment) {
        this.eveniment = eveniment;
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    public boolean isMuzicaPreferata() {
        return muzicaPreferata;
    }

    public void setMuzicaPreferata(boolean muzicaPreferata) {
        this.muzicaPreferata = muzicaPreferata;
    }

    public boolean isPrivelisteGeam() {
        return privelisteGeam;
    }

    public void setPrivelisteGeam(boolean privelisteGeam) {
        this.privelisteGeam = privelisteGeam;
    }

    public boolean isScaunEgronomic() {
        return scaunEgronomic;
    }

    public void setScaunEgronomic(boolean scaunEgronomic) {
        this.scaunEgronomic = scaunEgronomic;
    }

    public boolean isDecorareMasa() {
        return decorareMasa;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

//    public  class innerBuilder implements AbstractRezerareBuilderDRY {
//        @Override
//        public Rezervare buid(String denimireEveniment) {
//            return null;
//        }
//    }
}
