package ro.ase.seminar4.builder.clase;

public class InternareBuilderAlternativ implements InternareBuilderAbstractA {
    protected boolean patRabatabil;
    protected boolean micDejun;
    protected boolean papuci;
    protected boolean halat;
    protected String numePacient;

    public InternareBuilderAlternativ() {
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuci = false;
        this.halat = false;
    }

    public InternareBuilderAlternativ setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public InternareBuilderAlternativ setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public InternareBuilderAlternativ setPapuci(boolean papuci) {
        this.papuci = papuci;
        return this;
    }

    public InternareBuilderAlternativ setHalat(boolean halat) {
        this.halat = halat;
        return this;
    }

    public InternareBuilderAlternativ setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }

    @Override
    public Internare build(String nume) {
        Internare internareNebuna = new Internare(this.patRabatabil, this.micDejun, this.papuci, this.halat, nume);
        return internareNebuna;
    }
}
