package org.example.file.impl.models;

import org.example.file.impl.content.SorterContentUtil;
import org.example.file.model.abstracts.file.ObjFile;
import org.example.file.model.abstracts.file.OpenFile;

public class IntFile extends ObjFile {
    private final String content;

    public IntFile(String directoryForSaving, OpenFile openFile) {
        super(directoryForSaving, "integer.txt");
        content = SorterContentUtil.getInt(openFile.getPathFrom());

    }

    @Override
    public String getContent() {
        return content.trim();
    }
}
