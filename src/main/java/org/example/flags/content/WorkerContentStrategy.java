package org.example.flags.content;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkerContentStrategy{

    Path path;
    String strPath;
    boolean yourChoiceFlag;
    @Getter
    String contentFromFile;

    public void moveWithFile(String strPath, boolean yourChoice) {
        path = Paths.get(this.strPath);
        try {
            contentFromFile = Files.readString(path);
            try (FileWriter thisFile = new FileWriter(this.strPath, yourChoice)) {
                thisFile.write("New massage from MacBook");
            } catch (IOException e) {
            }

        } catch (IOException e) {
            System.err.println("File not found!\nCheck your path or write absolute path to your file!");
        }

    }


}
