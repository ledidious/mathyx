package de.ledidious.mathyx.elemental.scalar;

public class Decimal {

    // ================================================
    // Fields
    // ================================================

    public static final Decimal ZERO = new Decimal(0);
    public static final Decimal ONE = new Decimal(1);
    public static final Decimal TWO = new Decimal(2);
    public static final Decimal THREE = new Decimal(3);
    public static final Decimal FOUR = new Decimal(4);
    public static final Decimal FIVE = new Decimal(5);
    public static final Decimal SIX = new Decimal(6);
    public static final Decimal SEVEN = new Decimal(7);
    public static final Decimal EIGHT = new Decimal(8);
    public static final Decimal NINE = new Decimal(9);
    public static final Decimal TEN = new Decimal(10);

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
