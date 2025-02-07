package org.example.flag.model.abstracts.impl;

import org.example.file.impl.models.IntFile;
import org.example.file.impl.models.OpenFileImpl;
import org.example.file.model.abstracts.file.ObjFile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPrefixFlagTest {

    @Test
    void findPrefixTest() {
        ObjFile[] intFile = {new IntFile("", new OpenFileImpl("/Users/dmitrijmartynov/IdeaProjects/testTask/src/main/java/org/example/exampleFile.txt"))};
        String prefix = "myprefix_";
        String[] args1 = {"-p", prefix};
        MyPrefixFlag myPrefixFlag1 = new MyPrefixFlag(
                args1,
                intFile);
        myPrefixFlag1.getArgs();
        assertEquals(prefix, myPrefixFlag1.getArgs());

        String[] args2 = {"-p"};
        assertThrows(RuntimeException.class, () -> {
            new MyPrefixFlag(
                    args2,
                    intFile);
        });
    }

}