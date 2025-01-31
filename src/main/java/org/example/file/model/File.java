package org.example.file.model;

public interface File extends PathToFile, TypeOfFile {
    @Override
    String getPath();

    @Override
    void setContentForSave(String path);

    @Override
    void setTypeOfFile(FileType file);

    @Override
    default FileType getTypeOfFile() {
        return FileType.NONE;
    }

    String getContent();


}
