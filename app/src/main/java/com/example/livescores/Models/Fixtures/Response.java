package com.example.livescores.Models.Fixtures;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("fixture")
    @Expose
    private Fixture fixture;
    @SerializedName("league")
    @Expose
    private League league;
    @SerializedName("teams")
    @Expose
    private Teams teams;
    @SerializedName("goals")
    @Expose
    private Goals goals;
    @SerializedName("score")
    @Expose
    private Score score;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;

    public Fixture getFixture() {
        return fixture;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Teams getTeams() {
        return teams;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public Goals getGoals() {
        return goals;
    }

    public void setGoals(Goals goals) {
        this.goals = goals;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

}
