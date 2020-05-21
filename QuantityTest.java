package quantityMeasure;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 0.0);
        assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 0.0);
        assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 1.0);
        assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_WhenCompared_ShouldReturnEqualLength() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        boolean areQuantityEqual = feet1.equals(inch1);
        assertTrue(areQuantityEqual);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnEqualNotLength() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        boolean areQuantityEqual = feet1.equals(inch1);
        assertFalse(areQuantityEqual);
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnNotEqualLength() {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        boolean areQuantityEqual = inch1.equals(feet1);
        assertFalse(areQuantityEqual);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        boolean areQuantityEqual = feet1.equals(feet2);
        assertTrue(areQuantityEqual);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqualLength() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        boolean areQuantityEqual = feet.equals(inch);
        assertTrue(areQuantityEqual);
    }

    @Test
    public void given12InchAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean areQuantityEqual = inch.equals(feet);
        assertTrue(areQuantityEqual);
    }

    @Test
    public void givenNullFeetAnd1Inch_ShouldReturnNotEqual() {
        Quantity feet = null;
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        assertNotEquals(feet, inch);
    }

    @Test
    public void given1FeetAnd1Inch_WhenTypeProper_ShouldReturnEqual() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        assertEquals(feet.getClass(), inch.getClass());
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualLength() {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        boolean areQuantityEqual = yard.equals(feet);
        assertTrue(areQuantityEqual);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean areQuantityEqual = feet.equals(yard);
        assertFalse(areQuantityEqual);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean areQuantityEqual = inch.equals(yard);
        assertFalse(areQuantityEqual);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqualLength() {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        boolean areQuantityEqual = yard.equals(inch);
        assertTrue(areQuantityEqual);
    }

    @Test
    public void given36InchAnd1yard_WhenCompared_ShouldReturnEqualLength() {
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean areQuantityEqual = inch.equals(yard);
        assertTrue(areQuantityEqual);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        boolean areQuantityEqual = yard.equals(feet);
        assertTrue(areQuantityEqual);
    }


    @Test
    public void given2InchAnd5Cm_WhenCompared_ShouldReturnEqualLength() {
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        Quantity cm = new Quantity(Unit.CENTIMETER, 5.0);
        boolean areQuantityEqual = inch.equals(cm);
        assertTrue(areQuantityEqual);
    }

    @Test
    public void given2InchAnd2Inch_WhenAddition_ShouldReturn4Inch() {
        Quantity inch1 = new Quantity(Unit.INCH, 2.0);
        Quantity inch2 = new Quantity(Unit.INCH, 2.0);
        Quantity inch3 = new Quantity(Unit.INCH,4.0);
        Quantity addedQuantity = inch1.add(inch2);
        assertEquals(inch3,addedQuantity);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAddition_ShouldReturn14Inch() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity inch2 = new Quantity(Unit.INCH, 2.0);
        Quantity inch = new Quantity(Unit.INCH,14.0);
        Quantity addedQuantity = feet1.add(inch2);
        assertEquals(inch,addedQuantity);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAddition_ShouldReturn24Inch() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        Quantity inch = new Quantity(Unit.INCH,24.0);
        Quantity addedQuantity = feet1.add(feet2);
        assertEquals(inch,addedQuantity);
    }

    @Test
    public void given2InchAnd2Point5Cm_WhenAddition_ShouldReturn3Inch() {
        Quantity twoInch = new Quantity(Unit.INCH, 2.0);
        Quantity twoPoint5Cm = new Quantity(Unit.CENTIMETER, 2.5);
        Quantity threeInch = new Quantity(Unit.INCH,3.0);
        Quantity addedQuantity = twoInch.add(twoPoint5Cm);
        assertEquals(threeInch, addedQuantity);
    }

    @Test
    public void given1GallonAnd3Point78Litres_WhenCompared_ShouldReturnEqualLength() {
        Quantity oneGallon = new Quantity(Unit.GALLON, 1.0);
        Quantity threePointSevenEightLitres = new Quantity(Unit.LITRE, 3.78);
        boolean areQuantityEqual = oneGallon.equals(threePointSevenEightLitres);
        assertTrue(areQuantityEqual);
    }

    @Test
    public void given1LitreAnd1000Ml_WhenCompared_ShouldReturnEqualLength() {
        Quantity oneLitre = new Quantity(Unit.LITRE, 1.0);
        Quantity oneThousandsMl = new Quantity(Unit.MILLIMETER, 1000.0);
        boolean areQuantityEqual = oneLitre.equals(oneThousandsMl);
        assertTrue(areQuantityEqual);
    }

    @Test
    public void given1GallonAnd3Point7Litres_WhenAddition_ShouldReturnEqualResult() {
        Quantity oneGallon = new Quantity(Unit.GALLON, 1.0);
        Quantity threePointSevenEightLitres = new Quantity(Unit.LITRE, 3.78);
        Quantity sevenPointFiveSixLitres= new Quantity(Unit.LITRE,7.56);
        Quantity addedQuantity = oneGallon.add(threePointSevenEightLitres);
        assertEquals(sevenPointFiveSixLitres,addedQuantity);
    }

    @Test
    public void given1LitreAnd1000Ml_WhenAddition_ShouldReturn2Litres() {
        Quantity oneLitre = new Quantity(Unit.LITRE, 1.0);
        Quantity oneThousandMl = new Quantity(Unit.MILLIMETER, 1000.0);
        Quantity twoLitres = new Quantity(Unit.LITRE,2.0);
        Quantity addedQuantity = oneLitre.add(oneThousandMl);
        assertEquals(twoLitres,addedQuantity);
    }

    @Test
    public void given1KgAnd1000Grams_WhenCompared_ShouldReturnEqualLength() {
        Quantity oneKg = new Quantity(Unit.KILOGRAM, 1.0);
        Quantity oneThousandGrams = new Quantity(Unit.GRAMS, 1000.0);
        boolean areQuantityEqual= oneKg.equals(oneThousandGrams);
        assertTrue(areQuantityEqual);
    }

    @Test
    public void given1TonneAnd1000Kgs_WhenCompared_ShouldReturnEqual() {
        Quantity oneTonne = new Quantity(Unit.TONNE, 1.0);
        Quantity oneThousandKg = new Quantity(Unit.KILOGRAM, 1000.0);
        boolean areQuantityEqual =oneTonne.equals(oneThousandKg);
        assertTrue(areQuantityEqual);
    }

    @Test
    public void given1TonneAnd1000Gm_WhenAddition_ShouldReturn1001Kg() {
        Quantity oneTonne = new Quantity(Unit.TONNE, 1.0);
        Quantity oneThousandGrams = new Quantity(Unit.GRAMS, 1000.0);
        Quantity oneThousandOneKgs = new Quantity(Unit.KILOGRAM,1001.0);
        Quantity addedQuantity = oneTonne.add(oneThousandGrams);
        assertEquals(oneThousandOneKgs,addedQuantity);
    }

    @Test
    public void given212FehAnd100Cel_WhenCompared_ShouldReturnEqual(){
        Quantity feh = new Quantity(Unit.FAHRENHEIT,212.0);
        Quantity cel = new Quantity(Unit.CELSIUS,100.0);
        boolean areQuantityEqual = feh.equals(cel);
        assertTrue(areQuantityEqual);
    }
}