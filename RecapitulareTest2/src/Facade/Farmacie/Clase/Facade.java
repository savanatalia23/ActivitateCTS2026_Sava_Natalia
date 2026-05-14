package Facade.Farmacie.Clase;



public class Facade {


    public void eliberareReteta(Pacient pacient)
    {
        if(pacient.cardSanatate)
        {
            if(pacient.retetea.isEsteValabila())
            {
                boolean medDisp = true;
                for(int i=0; i< pacient.retetea.listaMedicamente.size(); i++)
                {
                    Medicament med = pacient.retetea.listaMedicamente.get(i);
                    if(!med.esteDisp())
                    {
                        medDisp = false;
                    }
                }
                if(medDisp)
                {
                    System.out.println("Se pot elibera toate Medicamentele!");
                }
                else{
                    System.out.println("Nu avem toate medicamentele pe stoc!");
                }
            }
            else{
                System.out.println("Reteta nu este valabila!");
            }
        }
        else{
            System.out.println("Nu are card de sanatate valid!");
        }
    }
}
