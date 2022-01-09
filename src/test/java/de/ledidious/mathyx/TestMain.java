package de.ledidious.mathyx;

import de.ledidious.mathyx.elemental.operator.Minus;
import de.ledidious.mathyx.elemental.scalar.Decimal;
import de.ledidious.mathyx.interpreter.CalcInterpreter;

public class TestMain {

    public static void main(String[] args) {
        System.out.println(new CalcInterpreter().getAvailableSigns());

    }
}
