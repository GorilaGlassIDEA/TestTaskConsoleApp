package org.example.file;

import lombok.Data;
import org.example.util.GetFileContent;


import java.nio.file.Path;

@Data
public class FileModel {
    private Path fromPath;
    private Path savePathForFiles;
    private ContentType contentType;
    private String contentStringFromFile;

    public FileModel(Path fromPath) {
        this.fromPath = fromPath;
        contentStringFromFile = GetFileContent.getContent(fromPath);
    }

    public FileModel(Path fromPath, Path savePathForFiles) {
        this(fromPath);
        this.savePathForFiles = savePathForFiles;
    }

    public FileModel(ContentType contentType) {
        this.contentType = contentType;
    }

    public FileModel() {
    }

}
