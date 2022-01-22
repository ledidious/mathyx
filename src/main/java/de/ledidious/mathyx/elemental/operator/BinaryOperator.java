package de.ledidious.mathyx.elemental.operator;

import de.ledidious.mathyx.elemental.scalar.Decimal;

public interface BinaryOperator extends Operator {

    Decimal combine(Decimal dec0, Decimal dec1);
}
