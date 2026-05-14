package Facade.ex1.Clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    protected boolean listaPaturi[];

    public Salon() {
        this.listaPaturi = new boolean[20];
        listaPaturi[2] =  true;
        listaPaturi[5] =  true;
    }

    public int ocuparePat()
    {
        for(int i=0; i<listaPaturi.length; i++)
        {
            if(listaPaturi[i]){
                System.out.println("Pacientul a ocupat patul "  +  i );
                return  1;
            }
        }
        return 0;
    }

}
