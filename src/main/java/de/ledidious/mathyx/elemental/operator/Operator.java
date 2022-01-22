package de.ledidious.mathyx.elemental.operator;

public interface Operator {

    String getSign();

    default String[] getAltSigns() {
        return new String[0];
    }
}
