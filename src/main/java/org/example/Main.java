package org.example;

import org.example.file.impl.models.IntFile;
import org.example.file.impl.models.OpenFileImpl;
import org.example.file.model.abstracts.file.OpenFile;

public class Main {
    public static void main(String[] args) {
        String pathFrom =
                "/Users/dmitrijmartynov/IdeaProjects/testTask/src/main/java/org/example/exampleFile.txt";

        OpenFile file = new OpenFileImpl(pathFrom);
        IntFile intFile = new IntFile("", file);
        System.out.println(intFile.getContent());
    }
}