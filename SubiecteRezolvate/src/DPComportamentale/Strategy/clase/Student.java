package DPComportamentale.Strategy.clase;

public class Student {

    private String nume;
    private ModSustinere modSustinere;

    public Student(ModSustinere modSustinere, String nume) {
        this.modSustinere = modSustinere;
        this.nume = nume;
    }
    public Student(String nume) {
        this.modSustinere = new ProbaGrila();
        this.nume = nume;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare()
    {
        modSustinere.sustinereExamen();
    }
}
