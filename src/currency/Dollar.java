package currency;

public class Dollar extends Money {

    public Dollar(int amount) {
        super.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
