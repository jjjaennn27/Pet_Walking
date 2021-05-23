package com.example.pet_walking;

public class Walk {

    String Time;
    String Place;

    public Walk(String Time, String Place) {
        this.Time = Time;
        this.Place = Place;
    }


    public String getTime() {
        return Time;
    }
    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getPlace() {
        return Place;
    }
    public void setPlace(String Place) {
        this.Place = Place;
    }

}