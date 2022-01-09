package de.ledidious.mathyx.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtils {

    /**
     * Read from resource path
     */
    public static BufferedReader readFile(String path) {
        final InputStream inputStream = FileUtils.class.getResourceAsStream(path);
        if (inputStream == null) {
            throw new IllegalArgumentException("File to read not found: " + path);
        }
        return new BufferedReader(new InputStreamReader(inputStream));
    }
}
