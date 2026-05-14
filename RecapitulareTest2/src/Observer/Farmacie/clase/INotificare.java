package Observer.Farmacie.clase;

public interface INotificare {
    void adaugaClient(IClient client);
    void scoateClient(IClient client);
    void trimiteNotificare(String mesaj);
}
