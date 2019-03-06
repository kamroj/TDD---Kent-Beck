package currency;

public class Franc extends Money {

    public Franc(int amount) {
        super.amount = amount;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    String currency() {
        return "CHF";
    }
}
