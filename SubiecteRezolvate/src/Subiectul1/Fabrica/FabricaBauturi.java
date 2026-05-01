package Subiectul1.Fabrica;


import Subiectul1.Clase.Bautura;
import Subiectul1.Clase.Cafea;
import Subiectul1.Clase.Ceai;
import Subiectul1.Clase.CiocolataCalda;

public class FabricaBauturi {

    public Bautura getBautura(TipBautura tip, String nume, int volum, float pret){
        switch (tip){
            case TipBautura.CEAI -> {
                return new Ceai(nume, pret, volum);
            }
            case TipBautura.CAFEA -> {
                return new Cafea(nume, pret, volum);
            }
            case TipBautura.CIOCOLATA_CALDA -> {
                return new CiocolataCalda(nume, pret, volum);
            }
            default -> {
                return null;
            }
        }
    }
}
