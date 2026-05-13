package Command.ex1.clase;

public class ComandaBurger implements IComanda{

    private String nume;
    private int pret;
    private  Bucatar bucatar;


    public ComandaBurger(String nume, int pret, Bucatar bucatar) {
        this.nume = nume;
        this.pret = pret;
        this.bucatar= bucatar;
    }

    @Override
    public void executaComanda() {
        System.out.println("Burgerul " +this.nume+ " costa "+ this.pret + " lei si este preparat de " + bucatar.getNume());

    }
}
