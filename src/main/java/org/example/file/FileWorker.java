package org.example.file;

import org.example.file.model.abstracts.file.ObjFile;

public interface FileWorker {
    void addFile(ObjFile... files);
    void createFile(boolean modeForRecordOrAddInfoToFile);
}
