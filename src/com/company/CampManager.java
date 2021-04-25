package com.company;

public class CampManager {
    public void addDay (Camp camp, Day day) {
        camp.Days.add(day);
    }
    public void deleteDay (Camp camp, Day day) {
        camp.Days.remove(day);
    }
}