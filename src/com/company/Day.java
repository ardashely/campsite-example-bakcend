package com.company;

import java.util.List;

public class Day {
    int ID;
    String name;
    List<Content> Contents;

    public Day(int ID, String name, List<Content> Contents) {
        this.ID = ID;
        this.name = name;
        this.Contents = Contents;
    }
}