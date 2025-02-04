package org.example.file;

import org.example.file.model.abstracts.file.ObjFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Сохраняет все файлы в один массив,
// после чего проходит по каждому файлу и сохраняет его по пути
public class FileWorkerUtil implements FileWorker {
    private final List<ObjFile> thisFiles = new ArrayList<>();

    public void addFile(ObjFile... files) {
        thisFiles.addAll(List.of(files));
    }

    public void createFile(boolean modeForRecordOrAddInfoToFile) {
        Path savePathForFiles;
        if (!thisFiles.isEmpty()) {
            for (ObjFile thisFile : thisFiles) {
                savePathForFiles = Paths.get(thisFile.getPathFileForSaving());
                try (BufferedWriter writer = new BufferedWriter(
                        new FileWriter(savePathForFiles.toFile(), modeForRecordOrAddInfoToFile)
                )) {
                    writer.write(thisFile.getContent());
                } catch (IOException e) {
                    throw new RuntimeException("Не удалось создать файл", e);
                }
            }
        }
    }
}
