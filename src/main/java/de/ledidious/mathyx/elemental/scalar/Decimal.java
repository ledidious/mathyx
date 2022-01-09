package de.ledidious.mathyx.elemental.scalar;

public class Decimal {

    // ================================================
    // Fields
    // ================================================

    private final double val;

    // ================================================
    // Constructor
    // ================================================

    public Decimal(byte val) {
        this.val = val;
    }

    public Decimal(short val) {
        this.val = val;
    }

    public Decimal(int val) {
        this.val = val;
    }

    public Decimal(long val) {
        this.val = val;
    }

    public Decimal(float val) {
        this.val = val;
    }

    public Decimal(double val) {
        this.val = val;
    }

    public Decimal(char val) throws NumberFormatException {
        this.val = Double.parseDouble(val + "");
    }

    public Decimal(String val) throws NumberFormatException {
        this.val = Double.parseDouble(val);
    }

    public Decimal(boolean val) {
        this.val = val ? 1 : 0;
    }

    // ================================================
    // Methods
    // ================================================

    public double getVal() {
        return val;
    }

    @Override
    public String toString() {
        return Double.toString(val);
    }
}
