package org.example.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetFileContent {
    public static String getContent(Path pathToFile){
        try {
            return Files.readString(pathToFile);
        } catch (IOException e) {
            //TODO: корректно обработать ошибку
            throw new RuntimeException(e);
        }
    }
}
