package quantityMeasure;

public class Quantity {


    private final double value;
    private final Unit unit;

    public Quantity(Unit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity that = (Quantity) o;
        return Double.compare(that.unit.getConvertedValue(that.value),
                this.unit.getConvertedValue(this.value)) == 0;
    }

    public Quantity add(Quantity that) {
        return new Quantity(Unit.KILOGRAM, this.unit.getConvertedValue(this.value) + that.unit.getConvertedValue(that.value));
    }
}




