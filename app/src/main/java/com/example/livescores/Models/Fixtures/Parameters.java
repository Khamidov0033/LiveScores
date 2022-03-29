package com.example.livescores.Models.Fixtures;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Parameters {

    @SerializedName("live")
    @Expose
    private String live;

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

}
