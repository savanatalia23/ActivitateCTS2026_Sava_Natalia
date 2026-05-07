package DPComportamentale.Observer.ex1.clase;

public interface IRestaurant {
    void adaugaClient(IClient clientNou);
    void dezaboneazaClient(IClient clientNou);
    void trimiteNotificari(String mesaj);
}
