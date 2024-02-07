package com.moutimid.sqlapp.model;
public class BeachItem {
    private String itemName;
    private String itemName1;
    private String itemText;
    private int itemImage;

    public BeachItem(String itemName, String itemName1, String itemText, int itemImage) {
        this.itemName = itemName;
        this.itemName1 = itemName1;
        this.itemText = itemText;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemName1() {
        return itemName1;
    }

    public String getItemText() {
        return itemText;
    }

    public int getItemImage() {
        return itemImage;
    }
}
