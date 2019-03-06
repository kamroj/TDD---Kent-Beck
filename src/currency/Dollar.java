package currency;

public class Dollar extends Money {

    public Dollar(int amount) {
        super.amount = amount;
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    String currency() {
        return "USD";
    }
}
