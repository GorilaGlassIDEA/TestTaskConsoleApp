package org.example.flags.content;

import org.example.flags.Flag;

import java.io.IOException;

public interface ContentStrategy {
    void moveWithFile(String path, String newContent) throws IOException;
}
