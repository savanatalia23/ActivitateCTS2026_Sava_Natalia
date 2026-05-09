package DPStructurale.Facade.ex1.clase;

public class FacadeMasa {
    protected Receptioner receptioner;

    public FacadeMasa(Receptioner receptioner) {
        this.receptioner = receptioner;
    }

    public void verficareMasa(Masa masa) {
        if (receptioner.verificaMasa(masa)) {
            if (masa.isEsteDebarasata()) {
                if (masa.isAreServetele()) {
                    System.out.println("Masa este gata pentru urmatorii clienti!");
                }
                else{
                    System.out.println("Masa nu are servetele noi!");
                }
            } else {
                System.out.println("Masa nu este debarasata!");
            }
        } else {
            System.out.println("Masa nu este libera!");
        }
    }
}
