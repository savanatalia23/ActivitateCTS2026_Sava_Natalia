package Adapter.AplicatieSpital;

public class MedicamentSpital {

    public void achizitionareMedicamen(){
        System.out.println(
                this.prezintaReteta() ?   " Medicament achizitionat" : "Nu are reteta"
        );
    };

    boolean prezintaReteta(){
        System.out.println("Clientul are reteta pentru acest medicament");
        return  true;
    };
}
