package Strategy.Clase;

public class Card implements ModalitateDePlata {
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul cu numele " + numeClient + " are de plata card "+ suma + " lei.");

    }
}
