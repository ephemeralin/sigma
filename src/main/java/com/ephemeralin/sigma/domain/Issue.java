package com.ephemeralin.sigma.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Issue {

    private @Id @GeneratedValue Long id;
    private String summary;
    private String description;

    public Issue() {
    }

    public Issue(String summary, String description) {
        this.summary = summary;
        this.description = description;
    }
}
