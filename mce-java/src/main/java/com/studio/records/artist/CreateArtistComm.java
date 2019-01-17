package com.studio.records.artist;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class CreateArtistComm {

    @NotNull
    @Length(min=1, max=30)
    private String pseudonyme;
    @NotNull
    @Length(min=1, max=30)
    private String firstName;
    @NotNull
    @Length(min=1, max=30)
    private String surname;
    @NotNull
    @Length(min = 0, max = 20)
    private String genre;
    @NotNull
    @Length(min = 0, max = 20)
    private String country;
    @NotNull
    @Length(min = 0, max = 10)
    private String dateOfBirth;
    @NotNull
    @Length(min = 0, max = 100)
    private String photo;

    public String getPseudonyme() {
        return pseudonyme;
    }

    public void setPseudonyme(String pseudonyme) {
        this.pseudonyme = pseudonyme;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
