package org.example.file.model.abstracts.file;

import org.example.file.impl.models.IntFile;
import org.example.file.impl.models.OpenFileImpl;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;


class IntObjTest {

    @Test
    void intObjTest() throws Exception {
        String savePathForFile = System.getProperty("user.dir") + "/example.txt";
        int a = 10, b = 20;
        String content = a + "\n" + " " + b + "\n" + a + " " + (a + b);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(savePathForFile, true))) {
            writer.write(content);
        }
        OpenFile openFile = new OpenFileImpl(savePathForFile);
        ObjFile objFile = new IntFile("", openFile);
        Files.deleteIfExists(Paths.get(savePathForFile));
        assertEquals(a + "\n" + b, objFile.getContent().trim());
    }
}