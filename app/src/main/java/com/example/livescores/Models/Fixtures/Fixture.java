package com.example.livescores.Models.Fixtures;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Fixture {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("referee")
    @Expose
    private Object referee;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("periods")
    @Expose
    private Periods periods;
    @SerializedName("venue")
    @Expose
    private Venue venue;
    @SerializedName("status")
    @Expose
    private Status status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getReferee() {
        return referee;
    }

    public void setReferee(Object referee) {
        this.referee = referee;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Periods getPeriods() {
        return periods;
    }

    public void setPeriods(Periods periods) {
        this.periods = periods;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
