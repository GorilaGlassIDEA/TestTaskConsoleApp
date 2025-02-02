package org.example.file.impl.models;

import org.example.file.impl.content.SorterContentUtil;
import org.example.file.model.abstracts.file.ObjFile;
import org.example.file.model.abstracts.file.OpenFile;

public class IntFile extends ObjFile {
    private final OpenFile openFile;

    public IntFile(String pathForeSaving, OpenFile openFile) {
        super(pathForeSaving, openFile);
        this.openFile = openFile;
    }

    @Override
    public String getContent() {
        return SorterContentUtil.getInt(openFile.getPathFrom());
    }
}
