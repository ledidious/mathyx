package de.ledidious.mathyx.interpreter;

import de.ledidious.mathyx.util.FileUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CalcInterpreter {

    private static CalcInterpreter INSTANCE;

    private static final String SIGN_CLASS_ASSOC_FILE = "/de/ledidious/mathyx/interpreter/sign_class_assoc.csv";

    private final Map<String, Class<?>> availableSigns = new HashMap<>();

    public CalcInterpreter() {
    }

    // ================================================
    // Static functions
    // ================================================

    public static CalcInterpreter instance() {
        return INSTANCE != null ? INSTANCE : (INSTANCE = new CalcInterpreter());
    }

    public static String fastInterpret(String calculation) {
        return instance().interpret(calculation);
    }

    // ================================================
    // Local functions
    // ================================================

    public String interpret(String calculation) {

        for (StringTokenizer tokenizer = new StringTokenizer(calculation); tokenizer.hasMoreTokens(); ) {
            String token = tokenizer.nextToken();

        }


        return null;
    }

    public Map<String, Class<?>> getAvailableSigns() {
        readSignClassAssociations();
        return availableSigns;
    }

    private void readSignClassAssociations() {

        if (!availableSigns.isEmpty()) {
            return;
        }

        try (BufferedReader reader = FileUtils.readFile(SIGN_CLASS_ASSOC_FILE)) {
            reader.readLine(); // Skip title row
            while (reader.ready()) {
                final String row = reader.readLine();
                final String[] elements = row.split("\\|");
                final String sign = elements[0].trim();
                final String classString = elements[1].trim();

                final Class<?> foundClass = Class.forName("de.ledidious.mathyx.elemental." + classString);
                availableSigns.put(sign, foundClass);
            }
        } catch (RuntimeException | IOException e) {
            throw new InternalError("Error during reading " + SIGN_CLASS_ASSOC_FILE);
        } catch (ClassNotFoundException e) {
            throw new InternalError("Invalid format of " + SIGN_CLASS_ASSOC_FILE, e);
        }
    }
}
