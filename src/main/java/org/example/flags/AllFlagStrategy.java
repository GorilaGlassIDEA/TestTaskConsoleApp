package org.example.flags;

import org.example.flags.content.ContentStrategy;
import org.example.flags.content.RecordContentStrategy;

import java.io.IOException;

public class AllFlagStrategy {

    ContentStrategy workerContentStrategy;
    String pathToFile;


    public AllFlagStrategy(String pathToFile){
        workerContentStrategy = new RecordContentStrategy();
        this.pathToFile = pathToFile;
    }

    public void setContentStrategy(ContentStrategy contentStrategy) {
        try {
            contentStrategy.moveWithFile(
                    pathToFile,
                    "some content???"
            );
            // content должен принимать от класса утилиты с помощью статического
            // метода, в который передается путь
            // до файла
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
