package org.example.flags.content;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class RecordContentStrategy implements ContentStrategy {


    // yourChoiceFlag = true для добавления
    // yourChoiceFlag = false для перезаписи
    private static final boolean yourChoiceFlag = false;
    @Override
    public void moveWithFile(String path, String newContent) throws IOException{
//            contentFromFile = Files.readString(pathObj); - эти
//            строки должны быть в утилите открывающей файл
        try (FileWriter thisFile = new FileWriter(path, yourChoiceFlag)) {
            thisFile.write("New massage from MacBook");
        }
    }
}
