package ChainOfResponsability.ex1.clase;

public class Nivel1 extends Nivel {

    @Override
    public void tratareProblema(Problema problema) {
        if(problema.gravitate<3)
        {
            System.out.println("Problema va fi tratata de departamentul Support Automat" );
        }
        else{
            succesor.tratareProblema(problema);
        }
    }
}
