package ChainOfResponsability.ex1.clase;

public class Nivel2 extends Nivel{

    @Override
    public void tratareProblema(Problema problema) {
        if(problema.gravitate<7)
        {
            System.out.println("problema va fi tratata de catre Specialist IT");
        }
        else{
            succesor.tratareProblema(problema);
        }
    }
}
