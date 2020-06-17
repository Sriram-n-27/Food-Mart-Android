package com.sriram_n.foodmart.Model;

public class Food {
   private String name, Image, description, price, discount, menuId;

    public Food() {
    }

    public Food(String name, String image, String description, String price, String discount, String menuId) {
        this.name = name;
        Image = image;
        this.description = description;
        this.price = price;
        this.discount = discount;
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
