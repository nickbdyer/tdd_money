package nickbdyer.uk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    //$5 + 10 CHF = $10 if rate is 2:1
    //make "amount" private
    //Dollar side effects?
    //Money rounding

}
