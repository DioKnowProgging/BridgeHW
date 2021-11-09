package com.company;

public class Main {

    public static void main(String[] args) {
	    Project [] projects = {
                new OnlineBookingService(new Java()),
                new OnlineShop(new JavaScript()),
                new OnlineBookingService(new Python())
        };

        for(Project project: projects){
            project.developProject();
        }
    }
}
