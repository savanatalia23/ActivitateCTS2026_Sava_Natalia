package DPComportamentale.Comand.ex3.clase;

public class Pacient {
    protected String nume;
    protected int varsta;

    public Pacient(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    public String afisareDetalii(){
        return  "pacientul cu numele " + this.nume +" care are varsta de " + this.varsta + " ani";
    }
}
