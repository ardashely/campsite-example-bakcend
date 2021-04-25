package com.company;

public class DayManager {
    public void addContent (Day day, Content content) {
        day.Contents.add(content);
    }
    public void deleteContent (Day day, Content content) {
        day.Contents.remove(content);
    }
}