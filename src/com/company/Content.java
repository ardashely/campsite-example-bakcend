package com.company;

public class Content {
    int ID;
    String title;
    String description;
    boolean isRead;

    public Content(int ID, String title, String description) {
        this.ID = ID;
        this.title = title;
        this.description = description;
        isRead = false;
    }
}