package com.example.livescores.Models.Fixtures;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Penalty {

    @SerializedName("home")
    @Expose
    private Object home;
    @SerializedName("away")
    @Expose
    private Object away;

    public Object getHome() {
        return home;
    }

    public void setHome(Object home) {
        this.home = home;
    }

    public Object getAway() {
        return away;
    }

    public void setAway(Object away) {
        this.away = away;
    }

}
