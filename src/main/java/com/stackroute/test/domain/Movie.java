package com.stackroute.test.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
    private Actor actor;

    public Actor getActor() {
        return actor;
    }

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Autowired
    public Movie(Actor actor) {

        this.actor = actor;
    }
    public Movie() {
    }


    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
