package com.company;

public abstract class Project {
    protected ProgramLanguage programLanguage;

    protected Project(ProgramLanguage programLanguage) {
        this.programLanguage = programLanguage;
    }

    public abstract void developProject();

}
