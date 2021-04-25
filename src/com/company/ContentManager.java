package com.company;

public class ContentManager {
    public void SwitchRead (Content content) {
        content.isRead = !content.isRead;
    }
    public void changeTitle (Content content, String title) {
        content.title = title;
    }
}
