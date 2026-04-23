package Adapter.AplicatieFarmacie;

import Adapter.AplicatieSpital.MedicamentSpital;

public class AdaptorObiecteMedicament extends MedicamentFarmacie {
    MedicamentSpital medicamentSpital;

    public AdaptorObiecteMedicament(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitionareMedicamen();
    }
}
