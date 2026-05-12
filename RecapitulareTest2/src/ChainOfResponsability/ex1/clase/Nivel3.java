package ChainOfResponsability.ex1.clase;

public class Nivel3 extends Nivel{


    @Override
    public void tratareProblema(Problema problema) {
        System.out.println("Problema va fi tratata de catre Echipa de Dezvoltare");
    }
}
