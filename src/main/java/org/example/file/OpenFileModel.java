package org.example.file;

import org.example.file.model.FileModel;

public class OpenFileModel extends FileModel {
    private String pathForSave;

    public OpenFileModel(String path) {
        super(path);
    }

    @Override
    public void setContentForSave(String pathForSave) {
        this.pathForSave = pathForSave;
    }

    @Override
    public String getContent() {
        return "";
    }
}
