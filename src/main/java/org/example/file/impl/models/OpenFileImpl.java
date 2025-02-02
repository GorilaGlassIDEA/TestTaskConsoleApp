package org.example.file.impl.models;

import lombok.Getter;
import org.example.file.model.abstracts.file.OpenFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OpenFileImpl extends OpenFile {
    @Getter
    private final String content;
    private final String pathFrom;

    public OpenFileImpl(String pathFrom) {
        super(pathFrom);
        this.pathFrom = pathFrom;
        try {
            content = Files.readString(Path.of(pathFrom));
        } catch (IOException e) {
            throw new RuntimeException("Не удалось открыть файл!");
        }
    }

}
