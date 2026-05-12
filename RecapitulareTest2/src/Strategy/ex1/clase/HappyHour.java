package Strategy.ex1.clase;

public class HappyHour implements Discount {

    protected int discount;

    public HappyHour(int discount) {
        this.discount = discount;
    }

    @Override
    public int calculeazaNota() {
        return discount;
    }
}
