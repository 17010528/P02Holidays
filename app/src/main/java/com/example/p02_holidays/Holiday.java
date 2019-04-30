package com.example.p02_holidays;

public class Holiday {
    private String eventName;
    private String date;

    public Holiday( String eventName , String date) {

        this.eventName  = eventName;
        this.date = date;

    }
    public String getEventName(){
        return eventName;
    }
    public String getDate(){
        return date;
    }
}
