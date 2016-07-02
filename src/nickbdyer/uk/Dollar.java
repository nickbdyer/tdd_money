package nickbdyer.uk;

public class Dollar extends Money{

    private String currency;

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier, "USD");
    }

    String currency() {
        return currency;
    }

}
