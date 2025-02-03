package org.example.file.model.abstracts.file;

import lombok.Getter;

// Общее описание всех открытых файлов
public abstract class OpenFile implements File {
    @Getter
    private final String pathFrom;

    public OpenFile(String pathFrom) {
        this.pathFrom = pathFrom;
    }

    @Override
    public abstract String getContent();


}
