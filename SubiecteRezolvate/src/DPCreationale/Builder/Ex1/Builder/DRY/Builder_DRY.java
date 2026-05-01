package DPCreationale.Builder.Ex1.Builder.DRY;


import DPCreationale.Builder.Ex1.Rezervare.Rezervare;

public class Builder_DRY implements AbstractRezerareBuilderDRY {

    Rezervare rezervare ;

    public static Builder_DRY instantaBuilderDry = null;

    public Builder_DRY() {
        this.rezervare = new Rezervare();
    }

    private String denumireEveniment;
    private boolean privelisteGeam = false;
    private boolean scaunErgonomic = false;
    private boolean deocorareMasa = false;
    private String genMuzicalPreferat = "Fara";
    private boolean muzicaPersonalizata = false;

    public Builder_DRY setDenumireEveniment(String denumireEveniment) {
        this.rezervare.setEveniment(denumireEveniment);
        return this;
    }

    public Builder_DRY setPriveliste(boolean priveliste) {
        this.rezervare.setPrivelisteGeam(priveliste);
        return this;
    }

    public Builder_DRY setScaunErgonomic(boolean scaunErgonomic) {
        this.rezervare.setScaunEgronomic(scaunErgonomic);
        return this;
    }

    public Builder_DRY setDecoratiuneMasa(boolean decoratiuneMasa) {
        this.rezervare.setDecorareMasa(decoratiuneMasa);
        return this;
    }
    public Builder_DRY setMuzicaPersonalizata(boolean muzicaPersonalizata) {
        this.rezervare.setMuzicaPreferata(muzicaPersonalizata);
        return this;
    }

    public Builder_DRY setGenMuzicalPreferat (String genMuzicalPreferat) {
        this.rezervare.setGenMuzical(genMuzicalPreferat);
        return this;
    }

    public static synchronized Builder_DRY getInstantaBuilderDry(){
      if (instantaBuilderDry == null)
      {
          instantaBuilderDry = new Builder_DRY();
      }
       return instantaBuilderDry;
    }
    @Override
    public Rezervare buid(String denumireEveniment) {
        this.rezervare.setEveniment(denumireEveniment);
        return this.rezervare;
    }
}
