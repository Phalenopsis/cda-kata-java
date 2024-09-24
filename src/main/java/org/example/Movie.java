package org.example;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String releaseDate;
    private ArrayList<String> actors = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }

    public void addActor(String actor) {
        actors.add(actor);
    }
}
