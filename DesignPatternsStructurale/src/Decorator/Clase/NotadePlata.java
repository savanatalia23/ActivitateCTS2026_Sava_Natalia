package Decorator.Clase;

public class NotadePlata implements INotadePlata{

    private int suma;
    private String data;

    public NotadePlata(String data, int suma) {
        this.data = data;
        this.suma = suma;
    }

    @Override
    public void printeaza() {
        System.out.println("Nota de plata din data de " + this.data + " este de " + this.suma + " lei");
    }
}
