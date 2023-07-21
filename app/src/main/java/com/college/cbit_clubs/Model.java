package com.college.cbit_clubs;

public class Model {

    String eventname;
    String venue;
    String date;
    String time;
    String description;
    public Model(){}
    public Model(String eventname,String venue,String date,String time,String description){

        this.eventname=eventname;
        this.venue=venue;
        this.date=date;
        this.time=time;
        this.description=description;
    }



    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}

