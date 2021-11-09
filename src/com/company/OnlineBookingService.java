package com.company;

public class OnlineBookingService extends Project {
    protected OnlineBookingService(ProgramLanguage programLanguage) {
        super(programLanguage);
    }

    @Override
    public void developProject() {
        System.out.println("Online Booking Service is developing");
        programLanguage.code();
    }
}
