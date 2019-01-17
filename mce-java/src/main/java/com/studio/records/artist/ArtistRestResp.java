package com.studio.records.artist;

public class ArtistRestResp {

    private String pseudonym;
    private String firstName;
    private String surname;
    private String genre;
    private String country;
    private String dateOfBirth;
    private String photo;

    public ArtistRestResp (String pseudonym, String firstName, String surname, String genre, String dateOfBirth, String photo){
        this.pseudonym = pseudonym;
        this.firstName = firstName;
        this.surname = surname;
        this.genre = genre;
        this.dateOfBirth = dateOfBirth;
        this.photo = photo;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
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
