package org.example.flag.model.abstracts.impl;

import lombok.Getter;
import org.example.flag.model.abstracts.model.PathFlag;

/**
 * Данный класс создан для настройки путей сохранения файлов
 * // по умолчанию файлы сохраняются в текущую рабочую папку System.getProperty("user.dir");
 */
public class PathFlagImpl extends PathFlag {
    private final String[] args;
    private String path = System.getProperty("user.dir");

    public PathFlagImpl(String[] args) {
        if (args == null) {
            throw new RuntimeException("Аргументы пустые, проверьте корректность ввода данных");
        }
        this.args = args;
    }

    @Override
    public String getArgs() {
        return path;
    }

    private void foundArgs() {


    }

}
