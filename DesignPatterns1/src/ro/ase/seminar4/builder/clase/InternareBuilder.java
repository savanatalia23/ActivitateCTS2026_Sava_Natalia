package ro.ase.seminar4.builder.clase;

public class InternareBuilder implements InternareBuilderAbstract {
    private Internare internare;

    public InternareBuilder(String nume) {
        this.internare = new Internare(false, false, false, false, nume);
    }

    public InternareBuilder setPatRabatabil(boolean patRabatabil) {
        internare.patRabatabil = patRabatabil;
        return this;
    }

    public InternareBuilder setMicDejun(boolean micDejun) {
        internare.micDejun = micDejun;
        return this;
    }

    public InternareBuilder setPapuci(boolean papuci) {
        internare.papuci = papuci;
        return this;
    }

    public InternareBuilder setHalat(boolean halat) {
        internare.halat = halat;
        return this;
    }

    public InternareBuilder setNumePacient(String numePacient) {
        internare.numePacient = numePacient;
        return this;
    }

    @Override
    public Internare build() {
        return internare;
    }
}
