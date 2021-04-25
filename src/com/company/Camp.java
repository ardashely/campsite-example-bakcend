package com.company;

import com.company.Day;

import java.util.List;

public class Camp {
    int ID;
    String name;
    List<Day> Days;

    public Camp(int ID, String name, List<Day> Days) {
        this.ID = ID;
        this.name = name;
        this.Days = Days;
    }
}