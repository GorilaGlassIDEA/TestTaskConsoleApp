package org.example.file.model.abstracts.file;

import lombok.Data;
import lombok.Getter;

// Общее описание всех открытых файлов
@Data
public abstract class OpenFile implements File {
    private String pathFrom;

    public OpenFile(String pathFrom) {
        this.pathFrom = pathFrom;
    }

    @Override
    public abstract String getContent();


}
