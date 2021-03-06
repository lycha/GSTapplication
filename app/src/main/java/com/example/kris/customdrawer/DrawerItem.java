package com.example.kris.customdrawer;

public class DrawerItem {

    private String ItemName;
    private int imgResID;
    private String title;

    public DrawerItem(String itemName, int imgResID) {
        super();
        ItemName = itemName;
        this.imgResID = imgResID;
    }

    public DrawerItem(String title) {
        this(null, 0);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemName() {
        return ItemName;
    }
    public void setItemName(String itemName) {
        ItemName = itemName;
    }
    public int getImgResID() {
        return imgResID;
    }
    public void setImgResID(int imgResID) {
        this.imgResID = imgResID;
    }

}