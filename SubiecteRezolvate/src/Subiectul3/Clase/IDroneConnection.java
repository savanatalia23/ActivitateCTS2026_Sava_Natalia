package Subiectul3.Clase;

public interface IDroneConnection {
    void connectUser(String userId);
    void disconnectUser(String userId);
    boolean isUserConnected(String userId);
    String getDedicatedChannel(String userId);
}
