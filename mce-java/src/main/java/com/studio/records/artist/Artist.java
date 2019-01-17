package com.studio.records.artist;


import javax.persistence.*;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true,nullable = false)
    private String pseudonym;
    @Column
    private String firstname;
    @Column
    private String surname;
    @Column
    private String genre;
    @Column
    private String country;
    @Column
    private String dateOfBirth;
    @Column
    private String photo;


    public Artist(String pseudonym, String firstname, String surname, String genre, String country, String dateOfBirth, String photo){
        this.pseudonym = pseudonym;
        this.firstname = firstname;
        this.surname = surname;
        this.genre = genre;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.photo = photo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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
