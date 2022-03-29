package com.example.livescores.Models.Fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("long")
    @Expose
    private String _long;
    @SerializedName("short")
    @Expose
    private String _short;
    @SerializedName("elapsed")
    @Expose
    private Integer elapsed;

    public String getLong() {
        return _long;
    }

    public void setLong(String _long) {
        this._long = _long;
    }

    public String getShort() {
        return _short;
    }

    public void setShort(String _short) {
        this._short = _short;
    }

    public Integer getElapsed() {
        return elapsed;
    }

    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

}
