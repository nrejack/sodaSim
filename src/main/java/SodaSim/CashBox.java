package SodaSim;

public class CashBox {
    private int quarters, dimes, nickles;
    private int dollars;

    public CashBox() {
        quarters = 0;
        dimes = 0;
        nickles = 0;
        dollars = 0;
    }

    public Money makeChange() {
        return new Money();
    }

    public void acceptMoney() {
        ;
    }    
}
