package org.example.flags.content;

import java.io.FileWriter;
import java.io.IOException;

public class AddNewInfoContentStrategy implements ContentStrategy{

    private static final boolean yourChoiceFlag = true;

    @Override
    public void moveWithFile(String path, String newContent) throws IOException {

        try (FileWriter thisFile = new FileWriter(path, yourChoiceFlag)) {
            thisFile.write(newContent);
        }
    }
}
