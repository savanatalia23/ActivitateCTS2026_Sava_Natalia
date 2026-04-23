package Facade.Clase;

public class Salon {

    private boolean paturiLibere[] = new boolean[20];
    private static Salon instanta = null;

    private Salon() {
        this.paturiLibere[2] = true;
        this.paturiLibere[10] = true;
        this.paturiLibere[12] = true;
        this.paturiLibere[5] = true;
        this.paturiLibere[17] = true;
    }

    public int patLiber(){
        for(int i=0; i<= this.paturiLibere.length; i++)
        {
            if( this.paturiLibere[i] == true)
                return i;
        }
        return -1;
    }

    public void ocupaPat(int numarPat)
    {
        this.paturiLibere[numarPat] = false;
    }

    public static Salon getInstance(){
        if(instanta == null)
            instanta = new Salon();
        return instanta;
    }

}
