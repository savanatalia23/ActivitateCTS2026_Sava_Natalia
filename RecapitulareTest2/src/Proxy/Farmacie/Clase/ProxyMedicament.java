package Proxy.Farmacie.Clase;


public class ProxyMedicament implements IMedicament{
    Medicament medicament;

    public ProxyMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    @Override
    public void afisreMedicament() {
        if(medicament.isAreReteta())
        {
            medicament.afisreMedicament();
        }
        else{
            System.out.println("Nu exista reteta pentru acest medicament");
        }
    }


}
