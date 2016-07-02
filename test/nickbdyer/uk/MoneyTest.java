package nickbdyer.uk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
    //TO DO

    //$5 + 10 CHF = $10 if rate is 2:1
    //Money rounding
    //hashCode()
    //Equal null
    //Equal object
    //Dollar/Franc duplcation
    //Common times
    //Compare Francs with Dollars
    //Currency?

    //DONE

    //$5 * 2 = $10
    //Dollar side effects?
    //equals
    //make "amount" private
    //5CHF * 2 = 10CHF
    //Common equals

}
