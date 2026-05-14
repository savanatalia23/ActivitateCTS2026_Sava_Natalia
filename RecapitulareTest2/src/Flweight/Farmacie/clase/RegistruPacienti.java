package Flweight.Farmacie.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruPacienti {

    protected Map<Integer, IPacient> listapacienti;

    public RegistruPacienti() {
        this.listapacienti = new HashMap<>();
    }

    public IPacient getPacient( String nume, int nrAsigurare)
    {
        IPacient pacient = listapacienti.get(nrAsigurare);
        if(pacient==null)
        {
            pacient = new Pacient( nrAsigurare, nume);
            listapacienti.put(nrAsigurare, pacient);
        }
        return  pacient;
    }
}
