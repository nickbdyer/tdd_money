package nickbdyer.uk;

public class Franc extends Money {

    private String currency;

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier, "CHF");
    }

    String currency() {
        return currency;
    }
}
