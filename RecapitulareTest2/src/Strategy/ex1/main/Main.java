package Strategy.ex1.main;

import Strategy.ex1.clase.Client;
import Strategy.ex1.clase.Dis20proc;
import Strategy.ex1.clase.HappyHour;

public class Main {
    static void main(String[] args) {
        Client cl = new Client("Natalia", 200);

        cl.afisezaNota();
        cl.setDiscount(new HappyHour(60));
        cl.afisezaNota();
        cl.setDiscount(new Dis20proc());
        cl.afisezaNota();
    }
}
