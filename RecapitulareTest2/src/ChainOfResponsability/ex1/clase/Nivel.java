package ChainOfResponsability.ex1.clase;

public abstract class Nivel {
    protected Nivel succesor;

    public Nivel( ) {
        this.succesor = null;
    }

    public void setSucceor(Nivel succeor) {
        this.succesor = succeor;
    }

    public abstract void tratareProblema(Problema problema);
}
