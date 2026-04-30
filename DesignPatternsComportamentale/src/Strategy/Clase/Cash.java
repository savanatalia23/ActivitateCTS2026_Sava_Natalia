package Strategy.Clase;

public class Cash implements ModalitateDePlata{



    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul cu numele " + numeClient + " are de plata cash "+ suma + " lei.");
    }
}
