package com.sriram_n.foodmart.Model;

public class Category {
    private String Name;
    private String Image;

    public Category() {
    }

    public Category(String name, String Image) {
        Name = name;
        this.Image = Image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        this.Image = image;
    }
}
