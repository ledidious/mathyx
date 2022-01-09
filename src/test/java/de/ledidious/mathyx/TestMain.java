package de.ledidious.mathyx;

import de.ledidious.mathyx.elemental.operator.Minus;
import de.ledidious.mathyx.elemental.scalar.Decimal;

public class TestMain {

    public static void main(String[] args) {
        System.out.println(new Minus().combine(new Decimal(1.4), new Decimal(0.7)));
    }
}
