package de.ledidious.mathyx;

import com.google.common.base.Stopwatch;
import de.ledidious.mathyx.interpreter.CalcInterpreter;

public class TestMain {

    public static void main(String[] args) {
        final Stopwatch stopwatch = Stopwatch.createStarted();
        System.out.println(new CalcInterpreter().getAvailableSigns());
        System.out.println(stopwatch.stop());

    }
}
