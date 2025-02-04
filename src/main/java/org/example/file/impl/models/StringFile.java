package org.example.file.impl.models;

import org.example.file.impl.content.SorterContentUtil;
import org.example.file.model.abstracts.file.ObjFile;
import org.example.file.model.abstracts.file.OpenFile;

public class StringFile extends ObjFile {
    private final String content;

    public StringFile(String directoryForSaving, OpenFile openFile) {
        super(directoryForSaving, "string.txt");
        content = SorterContentUtil.getString(openFile.getPathFrom());
    }

    @Override
    public String getContent() {
        return content.trim();
    }

}