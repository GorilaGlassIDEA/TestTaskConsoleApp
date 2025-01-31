package org.example.file.model;

public abstract class FileModel implements File {
    String path;

    public FileModel(String path) {
        this.path = path;
    }

    @Override
    public String getPath() {
        return path;
    }
}
