package quantityMeasure;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnEqualNotLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqualLength() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length inch = new Length(Length.Unit.INCH, 12.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        assertTrue(compareCheck);
    }
}