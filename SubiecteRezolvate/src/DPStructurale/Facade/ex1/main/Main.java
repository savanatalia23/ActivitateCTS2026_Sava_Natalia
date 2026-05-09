package DPStructurale.Facade.ex1.main;

import DPStructurale.Facade.ex1.clase.FacadeMasa;
import DPStructurale.Facade.ex1.clase.Masa;
import DPStructurale.Facade.ex1.clase.Receptioner;

public class Main {
    static void main(String[] args) {
        Receptioner receptioner1 = new Receptioner("Natalia");
        Masa masa1 = new Masa(true, true, true, 2);
        Masa masa2 = new Masa(true, true, false, 1);
        Masa masa3 = new Masa(false, true, true, 3);
        Masa masa4 = new Masa(true, false, true, 4);

        FacadeMasa facade= new FacadeMasa(receptioner1);
        facade.verficareMasa(masa1);
        facade.verficareMasa(masa2);
        facade.verficareMasa(masa3);
        facade.verficareMasa(masa4);
    }
}
