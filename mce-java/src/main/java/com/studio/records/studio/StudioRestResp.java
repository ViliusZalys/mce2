package com.studio.records.studio;

public class StudioRestResp {

    private String studioTitle;
    private String logo;
    private String category;
    private String size;

    public StudioRestResp (String studioTitle, String logo, String category, String size){
        this.studioTitle = studioTitle;
        this.logo = logo;
        this.category = category;
        this.size = size;
    }

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
