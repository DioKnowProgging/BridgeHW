package com.company;

public class OnlineShop extends Project {

    protected OnlineShop(ProgramLanguage programLanguage) {
        super(programLanguage);
    }

    @Override
    public void developProject() {
        System.out.println("Online Shop is developing");
        programLanguage.code();
    }
}
