package com.studio.records.studio;

import javax.persistence.*;

@Entity
public class Studio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true,nullable = false)
    private String studioTitle;
    @Column
    private String logo;
    @Column
    private String category;
    @Column
    private String size;

    public Studio (String title, String logo, String category, String size){
        this.studioTitle = studioTitle;
        this.logo = logo;
        this.category = category;
        this.size = size;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return studioTitle;
    }

    public void setTitle(String title) {
        this.studioTitle = studioTitle;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
