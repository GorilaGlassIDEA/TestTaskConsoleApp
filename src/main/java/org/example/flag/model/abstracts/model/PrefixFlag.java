package org.example.flag.model.abstracts.model;

import lombok.Getter;

@Getter
public abstract class PrefixFlag implements Flag {
    private String flag = "-p";

    @Override
    public void setFlag(String flag) {
        this.flag = flag;
    }

    public abstract String getArgs();
}
