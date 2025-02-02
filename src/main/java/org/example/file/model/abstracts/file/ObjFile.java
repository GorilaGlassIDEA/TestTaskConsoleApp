package org.example.file.model.abstracts.file;

import lombok.Getter;
import lombok.Setter;

//Интерфейс для описания файлов-объектов для сохранения
@Getter
public abstract class ObjFile implements File {
    private final String pathForSaving;

    public ObjFile(String pathForSaving, OpenFile openFile) {
        this.pathForSaving = pathForSaving;
    }


//    public abstract void saveFile();

}
