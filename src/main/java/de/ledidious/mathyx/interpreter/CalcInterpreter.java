package de.ledidious.mathyx.interpreter;

import de.ledidious.mathyx.elemental.operator.Operator;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class CalcInterpreter {

    private static CalcInterpreter INSTANCE;

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

    @SuppressWarnings("unchecked")
    private void readSignClassAssociations() {

        if (!availableSigns.isEmpty()) {
            return;
        }

        try {
            final Iterator<Path> srcFileItr =
                    Files.list(Paths.get(getClass().getResource("/de/ledidious/mathyx/elemental/operator").toURI())).iterator();

            while (srcFileItr.hasNext()) {
                final String classFileSuffix = ".class";
                Class.forName("de.ledidious.mathyx.elemental.operator.BinaryOperator");

                Path classFile = srcFileItr.next();
                if (!classFile.toString().endsWith(classFileSuffix)) continue;

                // Relativize to src
                classFile = Path.of(getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).relativize(classFile);

                // Form the .java file path to its qualified class identifier
                //      e.g. /operator/Plus.java to operator.Plus
                final String classFilePath = classFile.toString();
                final String qualifiedClassName = classFile.normalize().toString()
                        .substring(0, classFilePath.indexOf(classFileSuffix))
                        .replace(File.separatorChar, '.');

                final Class<?> clazz = Class.forName(qualifiedClassName);
                if (!Operator.class.isAssignableFrom(clazz) || (clazz.isInterface() || clazz.isAnnotation() || clazz.isEnum())) {
                    continue;
                }

                final Class<? extends Operator> operatorClass = (Class<? extends Operator>) clazz;
                final Operator example = operatorClass.getConstructor().newInstance();
                availableSigns.put(example.getSign(), operatorClass);
                for (String sign : example.getAltSigns()) {
                    availableSigns.put(sign, operatorClass);
                }
            }
        } catch (Exception e) {
            throw new InternalError(e);
        }
    }
}
