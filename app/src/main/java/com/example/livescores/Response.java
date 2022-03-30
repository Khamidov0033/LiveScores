package com.example.livescores;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import java.util.List;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.example.livescores.Models.Fixtures.Event;
import com.example.livescores.Models.Fixtures.Fixture;
import com.example.livescores.Models.Fixtures.Goals;
import com.example.livescores.Models.Fixtures.League;
import com.example.livescores.Models.Fixtures.Score;
import com.example.livescores.Models.Fixtures.Teams;
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

    @BindingAdapter("android:loadHomeImage")
    public static void loadHomeImage(ImageView imageView, String homeImageUrl){
        Glide.with(imageView)
                .load(homeImageUrl)
                .centerCrop()
                .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
                .into(imageView);
    }
    @BindingAdapter("android:loadAwayImage")
    public static void loadAwayImage(ImageView imageView, String homeImageUrl){
        Glide.with(imageView)
                .load(homeImageUrl)
                .centerCrop()
                .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
                .into(imageView);
    }

}
