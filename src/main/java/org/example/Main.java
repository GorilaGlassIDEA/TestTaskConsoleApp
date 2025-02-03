package org.example;

import org.example.file.FileWorkerUtil;
import org.example.file.impl.models.IntFile;
import org.example.file.impl.models.OpenFileImpl;
import org.example.file.impl.models.StringFile;
import org.example.file.model.abstracts.file.ObjFile;
import org.example.file.model.abstracts.file.OpenFile;

public class Main {
    public static void main(String[] args) {
        String pathFrom =
                "/Users/dmitrijmartynov/IdeaProjects/testTask/src/main/java/org/example/exampleFile.txt";
        OpenFile file = new OpenFileImpl(pathFrom);
        ObjFile intFile = new IntFile("", file);
        ObjFile stringFile = new StringFile("", file);
        intFile.setName("prefix");
        intFile.setDirectoryForSaving("/Users/dmitrijmartynov/IdeaProjects/testTask/src/main/java/org/example/file/impl/models");
        stringFile.setName("asda");
        FileWorkerUtil fileWorkerUtil = new FileWorkerUtil();
        fileWorkerUtil.addFile(intFile, stringFile);
        fileWorkerUtil.createFile(true);
    }
}