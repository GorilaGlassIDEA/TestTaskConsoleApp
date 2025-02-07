package org.example.flag.model.abstracts.model;

import lombok.Getter;

@Getter
public abstract class PathFlag implements Flag {
    private String flag = "-o";

    @Override
    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public abstract String getArgs();
}
