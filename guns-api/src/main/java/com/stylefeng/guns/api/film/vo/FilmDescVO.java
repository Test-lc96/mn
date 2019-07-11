package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class FilmDescVO implements Serializable {

    private String biography;
    private String filmId;

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    @Override
    public String toString() {
        return "FilmDescVO{" +
                "biography='" + biography + '\'' +
                ", filmId='" + filmId + '\'' +
                '}';
    }
}
