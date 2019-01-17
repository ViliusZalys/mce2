package com.studio.records.studio;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class CreateStudioComm {

    @NotNull
    @Length(min=1, max=50)
    private String studioTitle;
    @NotNull
    @Length(min=1, max=100)
    private String logo;
    @NotNull
    @Length(min=1, max=50)
    private String category;
    @NotNull
    @Length(min = 0, max = 50)
    private String size;

    public String getStudioTitle() {
        return studioTitle;
    }

    public void setStudioTitle(String studioTitle) {
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
