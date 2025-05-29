package com.byone421.combination.zst;

import java.util.List;

public abstract class AbstractFile {

    protected String name;

    public void printName(){
        System.out.println(name);
    }

    public abstract boolean Add(AbstractFile file);
    public abstract boolean Remove(AbstractFile file);
    public abstract List<AbstractFile> getChildren();
}
