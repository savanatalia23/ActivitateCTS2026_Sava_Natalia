package DPStructurale.Proxy.Ex1.Clase;

public class Autobuz {
    private int nr;
    private int calatori;

    public Autobuz(int calatori, int nr) {
        this.calatori = calatori;
        this.nr = nr;
    }

    public int getCalatori() {
        return calatori;
    }

    public int getNr() {
        return nr;
    }

    public boolean areCalatori() {
        if (calatori > 0) {
            calatori  -= 5;
            return true;
        } else {
            return false;
        }
    }
}
