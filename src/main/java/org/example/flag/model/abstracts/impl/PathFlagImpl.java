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
        this.args = args;
    }

    @Override
    public String getArgs() {
        foundArgs();
        return path;
    }

    private void foundArgs() {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals(getFlag())) {
                try {
                    path = args[i + 1];
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw new RuntimeException("Не введен аргумент пути для фалага " + getFlag());
                }
            }
        }
    }
}
