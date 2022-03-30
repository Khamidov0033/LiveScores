package com.example.livescores.Models.Fixtures;

import java.util.List;

import com.example.livescores.Response;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FullFixtures {

    @SerializedName("get")
    @Expose
    private String get;
    @SerializedName("parameters")
    @Expose
    private Parameters parameters;
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;
    @SerializedName("results")
    @Expose
    private Integer results;
    @SerializedName("paging")
    @Expose
    private Paging paging;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

}
