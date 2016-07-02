package nickbdyer.uk;

public interface Expression {

    Money reduce(Bank bank, String to);

}
