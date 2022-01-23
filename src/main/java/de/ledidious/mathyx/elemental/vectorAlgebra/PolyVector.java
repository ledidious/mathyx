package de.ledidious.mathyx.elemental.vectorAlgebra;

import de.ledidious.mathyx.elemental.scalar.Decimal;

public class PolyVector extends Vector {

    private final Decimal[] scalars;

    private PolyVector(int length) {
        this.scalars = new Decimal[length];
    }

    public PolyVector(double... scalars) {
        this.scalars = new Decimal[scalars.length];

        for (int i = 0; i < scalars.length; i++) {
            this.scalars[i] = new Decimal(scalars[i]);
        }
    }

    public PolyVector(Decimal... scalars) {
        this.scalars = scalars;
    }

    public static PolyVector withLength(int length) {
        return new PolyVector(length);
    }
}
