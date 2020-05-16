package quantityMeasure;

public enum Unit {

    FEET(12.0), INCH(1) , YARD(36.0) , CENTIMETER(0.4),
    GALLON(3780.0) , LITRE(1000.0) ,MILLIMETER(1);

   private double baseUnitConversation;

    Unit(double baseUnitConversation){
        this.baseUnitConversation = baseUnitConversation;
    }

    public double getConvertedValue(double value) {
        return this.baseUnitConversation * value;
    }
}
