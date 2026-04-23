package Proxy.SpitalProxy;

import Proxy.Clase.ISpital;
import Proxy.Clase.Pacient;
import Proxy.Clase.Spital;

public class ProxyCuAsigurare implements ISpital {

    private ISpital  spital;

    public ProxyCuAsigurare(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare())
        {
            spital.interneazaPacient(pacient);
        }
        else{
            System.out.println("Nu are asigurare");
        }
    }
}
