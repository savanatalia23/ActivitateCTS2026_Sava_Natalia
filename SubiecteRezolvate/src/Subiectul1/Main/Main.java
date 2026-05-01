package Subiectul1.Main;


import Subiectul1.Clase.Bautura;
import Subiectul1.Clase.Cafea;
import Subiectul1.Fabrica.FabricaBauturi;
import Subiectul1.Fabrica.TipBautura;

public class Main {
    static void main(String[] args) {

        FabricaBauturi fabricaBauturi = new FabricaBauturi();
        Bautura ceaiMusetel = fabricaBauturi.getBautura(TipBautura.CEAI, "Ceai de musetel", 190, 21f);
        ceaiMusetel.metodaPreparare();
        System.out.println(ceaiMusetel.toString());

        Bautura cafeaIced = fabricaBauturi.getBautura(TipBautura.CAFEA, "Iced Cafea", 250, 22.3f);
        cafeaIced.metodaPreparare();
        System.out.println(cafeaIced.toString());

        Bautura cafeaEspresso = fabricaBauturi.getBautura(TipBautura.CAFEA, "Espresso", 50, 12.5f);
        cafeaEspresso.metodaPreparare();
        System.out.println(cafeaEspresso.toString());

        Bautura cioco = fabricaBauturi.getBautura(TipBautura.CIOCOLATA_CALDA, "Nesquik", 500, 20.6f);
        cioco.metodaPreparare();
        System.out.println(cioco.toString());

        Cafea cafeaCopie = (Cafea) cafeaIced.copiaza();

        System.out.println(cafeaCopie.toString());

        cafeaCopie.setNume("Cafea cu gheata");

        System.out.println(cafeaCopie.toString());

        Bautura ceaiCopie = ceaiMusetel.copiaza();
        System.out.println(ceaiCopie.toString());

        Bautura ciocoCopie = cioco.copiaza();
        System.out.println(ciocoCopie.toString());


    }
}
