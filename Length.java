package quantityMeasure;

public class Length {


    enum Unit {FEET, INCH}

    ;
    private final double value;
    private final Unit unit;


    public Length(Unit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}

