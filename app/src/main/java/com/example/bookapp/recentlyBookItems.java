package com.example.bookapp;

public class recentlyBookItems {
    int image;
    String mtitle,mdesc;

    public recentlyBookItems(int image, String mtitle, String mdesc) {
        this.image = image;
        this.mtitle = mtitle;
        this.mdesc = mdesc;
    }

    public int getImage() {
        return image;
    }

    public String getMtitle() {
        return mtitle;
    }

    public String getMdesc() {
        return mdesc;
    }
}
