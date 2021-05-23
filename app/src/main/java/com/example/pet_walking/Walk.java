package com.example.pet_walking;

public class Walk {

    String timespinner;
    String txtplace;

    public Walk(String timespinner, String Txtplace) {
        this.timespinner = timespinner;
        this.txtplace = Txtplace;
    }


    public String getTimespinner() {
        return timespinner;
    }
    public void setTimespinner(String timespinner) {
        this.timespinner = timespinner;
    }

    public String getTxtplace() {
        return txtplace;
    }
    public void setTxtplace(String txtplace) {
        this.txtplace = txtplace;
    }

}