package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    public String description;

    public Skill() {

    }

    public Skill(String description) {
        this.description = description;
    }

}