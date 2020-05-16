package quantityMeasure;

public enum Unit {

    FEET(12.0), INCH(1), YARD(36.0), CENTIMETER(0.4),
    GALLON(3.78), LITRE(1), MILLIMETER(0.001), KG(1),
    GRAMS(0.001), TONNE(1000), FAHRENHEIT(100), CELSIUS(212);

    private double baseUnitConversation;

    Unit(double baseUnitConversation) {
        this.baseUnitConversation = baseUnitConversation;
    }

    public double getConvertedValue(double value) {
        return this.baseUnitConversation * value;
    }
}
