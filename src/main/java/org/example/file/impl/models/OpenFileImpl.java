package org.example.file.impl.models;

import lombok.Getter;
import org.example.file.model.abstracts.file.OpenFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Getter
public class OpenFileImpl extends OpenFile {
    private String content;

    public OpenFileImpl(String pathFrom) {
        super(pathFrom);
        try {
            content = Files.readString(Path.of(getPathFrom()));
        } catch (IOException e) {
            try {
                setPathFrom(System.getProperty("user.dir") + "/" + getPathFrom());
                content = Files.readString(Path.of(getPathFrom()));
            } catch (IOException e2) {
                System.out.println(this);
                throw new RuntimeException("Не удалось открыть файл!");
            }
        }
    }

    @Override
    public String toString() {
        return "OpenFileImpl{" +
                "content='" + content + '\'' +
                ", pathFrom='" + getPathFrom() + '\'' +
                '}';
    }
}
