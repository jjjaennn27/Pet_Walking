package com.example.pet_walking;

public class Walk {

    String timespinner;

    public Walk(String timespinner ) {
        this.timespinner = timespinner;
    }
    public Walk(){

    }

    public String getName() {
        return timespinner;
    }

    public void setName(String timespinner) {
        this.timespinner = timespinner;
    }

}