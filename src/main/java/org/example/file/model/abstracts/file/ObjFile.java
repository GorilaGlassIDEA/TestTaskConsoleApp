package org.example.file.model.abstracts.file;

import lombok.Getter;
import lombok.Setter;

//Интерфейс для описания файлов-объектов для сохранения
public abstract class ObjFile implements File {
    @Getter
    private String pathFileForSaving;
    private String directoryForSaving;
    private final String typeFileAndTxtFormat;
    private String prefix;
    private String fullName;

    public ObjFile(String directoryForSaving, OpenFile openFile, String typeFileAndTxtFormat) {
        this.typeFileAndTxtFormat = typeFileAndTxtFormat;
        if (directoryForSaving.isEmpty()) {
            this.directoryForSaving = System.getProperty("user.dir");
        } else {
            this.directoryForSaving = directoryForSaving;
        }
        pathFileForSaving = directoryForSaving + typeFileAndTxtFormat;
        fullName = typeFileAndTxtFormat;
    }

    public void setDirectoryForSaving(String directoryForSaving) {
        this.directoryForSaving = directoryForSaving;
        pathFileForSaving = directoryForSaving + "/" + getName();
    }

    public void setName(String prefix) {
        this.prefix = prefix;
        fullName = (prefix == null ? "" : prefix) + "_" + typeFileAndTxtFormat;
        pathFileForSaving = directoryForSaving + "/" + getName();
    }

    public String getName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "ObjFile{" + "pathFileForSaving='" + pathFileForSaving + '\n' + "directoryForSaving='" + directoryForSaving + '\n' + "typeFileAndTxtFormat='" + typeFileAndTxtFormat + '\n' + "prefix='" + prefix + '\n' + "getContent" + getContent() + '}';
    }
}
