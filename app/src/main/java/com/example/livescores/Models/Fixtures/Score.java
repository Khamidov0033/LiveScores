package com.example.livescores.Models.Fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Score {

    @SerializedName("halftime")
    @Expose
    private Halftime halftime;
    @SerializedName("fulltime")
    @Expose
    private Fulltime fulltime;
    @SerializedName("extratime")
    @Expose
    private Extratime extratime;
    @SerializedName("penalty")
    @Expose
    private Penalty penalty;

    public Halftime getHalftime() {
        return halftime;
    }

    public void setHalftime(Halftime halftime) {
        this.halftime = halftime;
    }

    public Fulltime getFulltime() {
        return fulltime;
    }

    public void setFulltime(Fulltime fulltime) {
        this.fulltime = fulltime;
    }

    public Extratime getExtratime() {
        return extratime;
    }

    public void setExtratime(Extratime extratime) {
        this.extratime = extratime;
    }

    public Penalty getPenalty() {
        return penalty;
    }

    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }

}
