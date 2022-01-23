package de.ledidious.mathyx.elemental.vectorAlgebra;

import de.ledidious.mathyx.elemental.scalar.Decimal;

public class TriVector extends Vector {

    private final Decimal scalar0;
    private final Decimal scalar1;
    private final Decimal scalar2;

    public TriVector(double scalar0, double scalar1, double scalar2) {
        this(new Decimal(scalar0), new Decimal(scalar1), new Decimal(scalar2));
    }

    public TriVector(Decimal scalar0, Decimal scalar1, Decimal scalar2) {
        this.scalar0 = scalar0;
        this.scalar1 = scalar1;
        this.scalar2 = scalar2;
    }
}
