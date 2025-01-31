package org.example.file.model;

// Нужен для получения пути файла, и при изменении
// способа получения пути к файлу программа не ломалась
public interface PathToFile {
    String getPath();
    void setContentForSave(String path);
}
