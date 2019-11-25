package com.ephemeralin.sigma.domain;

public class Issue {
    private final long id;
    private final String summary;
    private final String description;

    public Issue(long id, String summary, String description) {
        this.id = id;
        this.summary = summary;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }
}
