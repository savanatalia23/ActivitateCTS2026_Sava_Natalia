package ro.ase.seminar4.singleton.clase;

public class Logger {
    private int cod;
    private String sender;
    private String categorie;

    private static Logger instanta = null;

    private Logger(String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;
    }

    public static synchronized Logger getInstance(String sender, String categorie) {
        if (instanta == null) {
            instanta = new Logger(sender, categorie);
        }
        return instanta;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void afisareLog(String text) {
        System.out.println(sender + " cu id-ul " + cod + " a constatat in " + text + " din categoria " + categorie);
        this.cod++;
    }


}
