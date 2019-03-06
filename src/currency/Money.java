package currency;

public class Money {
    protected int amount;

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    static Franc franc(int amount) {
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        if (object == null)
            return false;

        Money money = (Money)object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
