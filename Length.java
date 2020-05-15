package quantityMeasure;

public class Length {

    private final double value;
    private final Unit unit;

    public Length(Unit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
        return Double.compare(that.unit.getConvertedValue(that.value),
                this.unit.getConvertedValue(this.value)) == 0;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}

