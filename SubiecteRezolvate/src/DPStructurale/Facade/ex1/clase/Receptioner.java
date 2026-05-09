package DPStructurale.Facade.ex1.clase;

public class Receptioner {
    private String nume;

    public Receptioner(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public boolean verificaMasa(Masa masa){
        return masa.isEsteLibera();
    }
}
