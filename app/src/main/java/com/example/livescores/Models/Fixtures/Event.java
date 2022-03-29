package com.example.livescores.Models.Fixtures;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("time")
    @Expose
    private Time time;
    @SerializedName("team")
    @Expose
    private Team team;
    @SerializedName("player")
    @Expose
    private Player player;
    @SerializedName("assist")
    @Expose
    private Assist assist;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("detail")
    @Expose
    private String detail;
    @SerializedName("comments")
    @Expose
    private Object comments;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Assist getAssist() {
        return assist;
    }

    public void setAssist(Assist assist) {
        this.assist = assist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Object getComments() {
        return comments;
    }

    public void setComments(Object comments) {
        this.comments = comments;
    }

}
