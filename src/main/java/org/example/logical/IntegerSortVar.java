package org.example.logical;

/**
 * Этот класс получается набор строк и
 * возращает строки в которых написано число int
 * **/

public class IntegerSortVar {
    public static String sortContentToFile(String fileContent) {
        StringBuilder answerLines = new StringBuilder();
        String allowedChar = "0123456789";

        for (String line : fileContent.split("\n")) {
            line = line.trim();
            if (checkChar(allowedChar, line)) {
                answerLines.append(line);
                answerLines.append("\n");
            }
        }
        return answerLines.toString();
    }

    public static boolean checkChar(String allowedChar, String uncheckedLine) {
        int count = 0;
        String[] splitContent = uncheckedLine.split("-");
        if (splitContent[0].isEmpty() && splitContent.length == 2) count++;
        if (
                splitContent.length == 1 ||
                        (splitContent.length == 2 && splitContent[0].isEmpty())
        ) {
            for (Character ch : uncheckedLine.toCharArray()) {
                if (allowedChar.contains(ch.toString())) {
                    ++count;
                }
            }
            return count == uncheckedLine.length();
        } else return false;
    }
}
