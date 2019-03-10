package currency;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    String currency() {
        return currency;
    }

    public boolean equals(Object object) {
        if (object == null)
            return false;

        Money money = (Money)object;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public Money reduce(String to) {
        return this;
    }

    Expression plus(Money addend) {
        return new Sum(this, addend);
    }


    public String toString() {
        return amount + " " + currency;
    }
}
