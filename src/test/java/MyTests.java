import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testIsSimplified() {
        assertEquals(true, new Rational(1,2).isSimplified(), "The output of checking if the Rational 1/2 is simplified should be: true");
        assertEquals(true, new Rational(2,3).isSimplified(), "The output of checking if the Rational 2/3 is simplified should be: true");
        assertEquals(false, new Rational(2,4).isSimplified(), "The output of checking if the Rational 2/4 is simplified should be: false");
        assertEquals(false, new Rational(4,2).isSimplified(), "The output of checking if the Rational 4/2 is simplified should be: false");
    }

    @Test
    public void testCalculateDoubleValue() {
        assertEquals(1.5, new Rational(3,2).calculateDecimalValue(), 0.01, "The output of calculating the double value of the Rational 3/2 is simplified should be: 1.5");
        assertEquals(0.25, new Rational(1,4).calculateDecimalValue(), 0.01, "The output of calculating the double value of the Rational 1/4 is simplified should be: 0.25");
    }

    @Test
    public void testPow() {
        assertEquals("1/4", new Rational(1,2).pow(2).toString(), "The output of raising the Rational 1/2 to the power of 2 should be: 1/4");
        assertEquals("1/16", new Rational(1,4).pow(2).toString(), "The output of raising the Rational 1/4 to the power of 2 should be: 1/16");
        assertEquals("125/216", new Rational(5,6).pow(3).toString(), "The output of raising the Rational 5/6 to the power of 3 should be: 125/216");
    }

    @Test
    public void testMatches() {
        assertEquals(true, new Rational(1,2).matches(2), "The output of checking if the Rational 1/2 contains the number 2 should be: true");
        assertEquals(true, new Rational(2,1).matches(2), "The output of checking if the Rational 2/1 contains the number 2 should be: true");
        assertEquals(false, new Rational(2,1).matches(3), "The output of checking if the Rational 2/1 contains the number 3 should be: false");
        assertEquals(false, new Rational(2,1).matches(3), "The output of checking if the Rational 2/1 contains the number 3 should be: false");
    }

    @Test
    public void testIsNegative() {
        assertEquals(false, new Rational(1,2).isNegative(), "The output of checking if the Rational 1/2 is negative should be: false");
        assertEquals(true, new Rational(-1,2).isNegative(), "The output of checking if the Rational -1/2 is negative should be: true");
        assertEquals(true, new Rational(1,-2).isNegative(), "The output of checking if the Rational 1/-2 is negative should be: true");
        assertEquals(false, new Rational(-1,-2).isNegative(), "The output of checking if the Rational -1/-2 is negative should be: false");
    }

    @Test
    public void testReciprocal() {
        assertEquals("1/2", new Rational(2,1).reciprocal().toString(), "The reciprocal Rational 2/1 is : 1/2");
        assertEquals("3/2", new Rational(2,3).reciprocal().toString(), "The reciprocal Rational 2/3 is : 3/2");
    }

    @Test
    public void testEquals() {
        assertEquals(false, new Rational(1,2).equals(new Rational(1, 3)), "The output of checking if the Rational 1/2 equals the Rational 1/3 should be: false");
        assertEquals(false, new Rational(2,3).equals(new Rational(1, 3)), "The output of checking if the Rational 2/3 equals the Rational 1/3 should be: false");
        assertEquals(true, new Rational(2,3).equals(new Rational(2, 3)), "The output of checking if the Rational 2/3 equals the Rational 2/3 should be: true");
    }
}
