package Adapter.Main;

import Adapter.AplicatieFarmacie.AdaptorObiecteMedicament;
import Adapter.AplicatieFarmacie.MedicamentFarmacie;
import Adapter.AplicatieSpital.MedicamentSpital;

public class Main {
    public static void realizeazsaAchizitie( MedicamentFarmacie medicamnetFarmacie){

        medicamnetFarmacie.cumparaMedicament();
    }
    static void main(String[] args) {



        MedicamentSpital paracetamol = new MedicamentSpital();
        MedicamentFarmacie nurofen = new MedicamentFarmacie();

        paracetamol.achizitionareMedicamen();
        nurofen.cumparaMedicament();

        realizeazsaAchizitie(nurofen);
        // nu pot sa apelez         realizeazsaAchizitie(paracetamol);
        //Adaptez un medicament Spital sa fie medicament Farmacie ca sa pot sa apelez

        AdaptorObiecteMedicament paracetamolAdaptat = new AdaptorObiecteMedicament(paracetamol);
        realizeazsaAchizitie(paracetamolAdaptat);



    }
}
