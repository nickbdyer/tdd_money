package nickbdyer.uk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    //TO DO

    //$5 + 10 CHF = $10 if rate is 2:1
    //Money rounding
    //hashCode()
    //Equal null
    //Equal object
    //Dollar/Franc duplcation
    //Common equals
    //Common times

    //DONE

    //$5 * 2 = $10
    //Dollar side effects?
    //equals
    //make "amount" private
    //5CHF * 2 = 10CHF

}
