package org.example.file.model.abstracts.file;

import lombok.Getter;

// Общее описание всех открытых файлов
@Getter
public abstract class OpenFile implements File {
    private final String pathFrom;

    public OpenFile(String pathFrom) {
        if (pathFrom == null) {
            this.pathFrom = System.getProperty("user.dir");
        } else {
            this.pathFrom = pathFrom;
        }
    }

    @Override
    public abstract String getContent();


}
