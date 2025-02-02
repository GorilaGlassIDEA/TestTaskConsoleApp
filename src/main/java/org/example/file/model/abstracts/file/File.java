package org.example.file.model.abstracts.file;

// у любого файла есть имя и контент
public interface File extends ContentForFile {
    @Override
    String getContent();
}
