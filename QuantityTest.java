package quantityMeasure;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 0.0);
        assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 1.0);
        assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 0.0);
        assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 1.0);
        assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length inch1 = new Length(Unit.INCH, 1.0);
        assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length inch1 = new Length(Unit.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnEqualNotLength() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length inch1 = new Length(Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Unit.INCH, 1.0);
        Length feet1 = new Length(Unit.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length feet2 = new Length(Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqualLength() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length inch = new Length(Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length inch = new Length(Unit.INCH, 12.0);
        Length feet = new Length(Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        assertTrue(compareCheck);
    }

    @Test
    public void givenNullFeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet = null;
        Length inch = new Length(Unit.INCH, 1.0);
        assertNotEquals(feet, inch);
    }

    @Test
    public void given1FeetAnd1Inch_WhenTypeProper_ShouldReturnEqual() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length inch = new Length(Unit.INCH, 1.0);
        assertEquals(feet.getClass(), inch.getClass());
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualLength() {
        Length yard = new Length(Unit.YARD, 1.0);
        Length feet = new Length(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        Length inch = new Length(Unit.INCH, 1.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqualLength() {
        Length yard = new Length(Unit.YARD, 1.0);
        Length inch = new Length(Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1yard_WhenCompared_ShouldReturnEqualLength() {
        Length inch = new Length(Unit.INCH, 36.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length yard = new Length(Unit.YARD, 1.0);
        Length feet = new Length(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        assertTrue(compareCheck);
    }


    @Test
    public void given2InchAnd5Cm_WhenCompared_ShouldReturnEqualLength() {
        Length inch = new Length(Unit.INCH, 2.0);
        Length cm = new Length(Unit.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(cm);
        assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAddition_ShouldReturn4Inch(){
        Length inch1 = new Length(Unit.INCH,2.0);
        Length inch2 = new Length(Unit.INCH,2.0);
        double inchAdded = inch1.add(inch2);
        assertEquals(4.0,inchAdded,0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAddition_ShouldReturn14Inch(){
        Length feet1 = new Length(Unit.FEET,1.0);
        Length inch2 = new Length(Unit.INCH,2.0);
        double addedResult = feet1.add(inch2);
        assertEquals(14,addedResult,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAddition_ShouldReturn24Inch(){
        Length feet1 = new Length(Unit.FEET,1.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        double addedResult = feet1.add(feet2);
        assertEquals(24,addedResult,0.0);
    }

    @Test
    public void given2InchAnd2nd5Cm_WhenAddition_ShouldReturn3Inch(){
        Length inch1 = new Length(Unit.INCH,2.0);
        Length cm1 = new Length(Unit.CENTIMETER,2.5);
        double addedResult = inch1.add(cm1);
        assertEquals(3,addedResult,0.0);
    }
}