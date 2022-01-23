package de.ledidious.mathyx.elemental.vectorAlgebra;

import de.ledidious.mathyx.elemental.scalar.Decimal;

public class BiVector extends Vector {

    private final Decimal scalar0;
    private final Decimal scalar1;

    public BiVector() {
        this(Decimal.ZERO, Decimal.ZERO);
    }

    public BiVector(double scalar0, double scalar1) {
        this(new Decimal(scalar0), new Decimal(scalar1));
    }

    public BiVector(Decimal scalar0, Decimal scalar1) {
        this.scalar0 = scalar0;
        this.scalar1 = scalar1;
    }
}
