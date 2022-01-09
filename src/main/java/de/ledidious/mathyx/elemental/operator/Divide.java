package de.ledidious.mathyx.elemental.operator;

import de.ledidious.mathyx.elemental.scalar.Decimal;

public class Divide implements BinaryOperator {
    @Override
    public Decimal combine(Decimal dec0, Decimal dec1) {
        return new Decimal(dec0.getVal() / dec1.getVal());
    }
}
