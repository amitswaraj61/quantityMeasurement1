package quantityMeasure;

public enum Unit {

    FEET(12.0), INCH(1) , YARD(36.0) , CENTIMETER(0.4);

    double baseUnitConversation;

    Unit(double baseUnitConversation){
        this.baseUnitConversation = baseUnitConversation;
    }

    public boolean compare(Length l1, Length l2){
        return Double.compare(l1.value*l1.unit.baseUnitConversation,
                l2.value*l2.unit.baseUnitConversation) == 0;
    }
}
