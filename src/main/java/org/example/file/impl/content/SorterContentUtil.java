package org.example.file.impl.content;

import org.example.file.model.abstracts.file.OpenFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SorterContentUtil {

    private static String sort(String path, int b) {
        final StringBuilder integers = new StringBuilder();
        final StringBuilder doubles = new StringBuilder();
        final StringBuilder strings = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll(" ", "");
                if (line.isEmpty()) {
                    continue;
                }
                try {
                    integers.append(Integer.parseInt(line));
                } catch (NumberFormatException e1) {
                    try {
                        doubles.append(Double.parseDouble(line));
                    } catch (NumberFormatException e2) {
                        strings.append(line);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Невозможно открыть файл");
        }
        switch (b) {
            case 0 -> {
                return integers.toString();
            }
            case 1 -> {
                return doubles.toString();
            }
            case 2 -> {
                return strings.toString();
            }
        }
        return "";
    }

    public static String getInt(String path) {
        return sort(path, 0);
    }
    public static String getDouble(String path) {
        return sort(path, 1);
    }
    public static String getString(String path) {
        return sort(path, 2);
    }

}
