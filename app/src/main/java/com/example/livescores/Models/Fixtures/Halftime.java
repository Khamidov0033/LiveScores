package com.example.livescores.Models.Fixtures;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Halftime {

    @SerializedName("home")
    @Expose
    private Integer home;
    @SerializedName("away")
    @Expose
    private Integer away;

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public Integer getAway() {
        return away;
    }

    public void setAway(Integer away) {
        this.away = away;
    }

}
