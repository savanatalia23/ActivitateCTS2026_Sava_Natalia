package Subiectul3.Clase;

public class ModulAI extends AutonomousDriving implements IPrototype, Cloneable{

    protected int viteza;
    protected float costDezvoltare;


    public ModulAI(String version, float costDezvoltare, int viteza) throws InterruptedException {
        super(version);
        this.costDezvoltare = costDezvoltare;
        this.viteza = viteza;
    }

    public ModulAI(String versiune ) throws InterruptedException {
        super(versiune);
    };
    public
    @Override
    void applyRule(int index, String context) {

    }
    public float getCostDezvoltare() {
        return costDezvoltare;
    }

    public void setCostDezvoltare(float costDezvoltare) {
        this.costDezvoltare = costDezvoltare;
    }

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ModulAI: ");
        sb.append("costDezvoltare=").append(costDezvoltare);
        sb.append(", viteza=").append(viteza);
        return sb.toString();
    }

    @Override
    public IPrototype clone() throws  CloneNotSupportedException {
        ModulAI copie = null;

        copie = (ModulAI) super.clone();

        copie.viteza = this.viteza;
        copie.costDezvoltare = costDezvoltare;

        return copie;
    }
}
