package com.example.bookapp;

public class BookItems {
    int bookImage;
    String bookTitle, bookDescription;

    public BookItems(int bookImage, String bookTitle, String bookDescription) {
        this.bookImage = bookImage;
        this.bookTitle = bookTitle;
        this.bookDescription = bookDescription;
    }

    public int getBookImage() {
        return bookImage;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookDescription() {
        return bookDescription;
    }
}
