package org.example.file.impl.models;

import org.example.file.impl.content.SorterContentUtil;
import org.example.file.model.abstracts.file.ObjFile;
import org.example.file.model.abstracts.file.OpenFile;

public class DoubleFile extends ObjFile {
    private final String content;

    public DoubleFile(String directoryForSaving, OpenFile openFile) {
        super(directoryForSaving, openFile, "double.txt");
        content = SorterContentUtil.getDouble(openFile.getPathFrom());
    }

    @Override
    public String getContent() {
        return content.trim();
    }

}
