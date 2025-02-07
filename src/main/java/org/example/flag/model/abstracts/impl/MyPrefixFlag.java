package org.example.flag.model.abstracts.impl;

import lombok.Getter;
import org.example.file.model.abstracts.file.ObjFile;
import org.example.flag.model.abstracts.model.PrefixFlag;

import java.util.List;

public class MyPrefixFlag extends PrefixFlag {
    private String prefixName = "";
    private final String[] args;

    public MyPrefixFlag(String[] args, ObjFile[] files) {
        this.args = args;
        if (List.of(args).contains(getFlag())) {
            findPrefix();
            for (ObjFile objFile : files) {
                objFile.setName(prefixName);
            }
        }
    }

    private void findPrefix() {
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals(getFlag())) {
                    try {
                        prefixName = args[i + 1];
                    } catch (IndexOutOfBoundsException e) {
                        throw new RuntimeException("Некорректный формат ввода данных, проверьте строку после флага " + getFlag());
                    }
                }
            }
        }
    }

    @Override
    public String getArgs() {
        return prefixName;
    }
}
