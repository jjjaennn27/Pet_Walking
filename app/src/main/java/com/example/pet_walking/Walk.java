package com.example.pet_walking;

public class Walk {

    String time;
    String txtplace;

    public Walk(String time, String Txtplace) {
        this.time = time;
        this.txtplace = Txtplace;
    }


    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public String getTxtplace() {
        return txtplace;
    }
    public void setTxtplace(String txtplace) {
        this.txtplace = txtplace;
    }

}