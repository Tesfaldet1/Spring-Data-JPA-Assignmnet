package se.lexicon.springdatajpaassignmnet.Entities;

import javax.persistence.Entity;
import javax.persistence.Entity;
public enum Measurement {
    KG,HG, ML, DL, G, CL, TSP;

    private Long id;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
