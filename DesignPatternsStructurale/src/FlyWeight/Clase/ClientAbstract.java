package FlyWeight.Clase;

public interface ClientAbstract {

    void rezerva(Rezervare rezervare);
    void plateste(Rezervare rezervare, double taxaPerPersoana);
}
