package org.example;

import org.example.file.FileWorkerUtil;
import org.example.file.impl.models.DoubleFile;
import org.example.file.impl.models.IntFile;
import org.example.file.impl.models.OpenFileImpl;
import org.example.file.impl.models.StringFile;
import org.example.file.model.abstracts.file.File;
import org.example.file.model.abstracts.file.ObjFile;
import org.example.file.model.abstracts.file.OpenFile;

public class Main {
    public static void main(String[] args) {
        String pathFrom =
                "/Users/dmitrijmartynov/IdeaProjects/testTask/src/main/java/org/example/exampleFile.txt";
        OpenFile file = new OpenFileImpl(pathFrom);
        ObjFile doubleFiles = new DoubleFile("", file);
        ObjFile intFiles = new IntFile("", file);
        ObjFile stringFiles = new StringFile("", file);

        FileWorkerUtil workerUtil = new FileWorkerUtil();
        workerUtil.addFile(doubleFiles, intFiles, stringFiles);
        System.out.println(doubleFiles);
        workerUtil.createFile(true);
        System.out.println(doubleFiles.getContent());
    }
}