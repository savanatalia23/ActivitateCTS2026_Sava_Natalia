package Strategy.ex1.clase;

public class Client {
    protected String nume;
    protected int sumaNota;
    protected Discount discount;

    public Client( String nume, int sumaNota) {
        this.discount = new HappyHour(10);
        this.nume = nume;
        this.sumaNota = sumaNota;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void afisezaNota(){
        int suma =this.sumaNota - discount.calculeazaNota();
        System.out.println("Suma totala este " +  suma);
    }
}
