package DPComportamentale.Comand.ex1.clase;

public class Autobuz {

    private String producator;

    public Autobuz(String producator) {
        this.producator = producator;
    }

    public void pleacaPeTraseu(int numarLinie){
        System.out.println("Autobuzul " + this.producator + " porneste pe linia " + numarLinie);
    }
}
