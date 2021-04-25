package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Content content1 = new Content(1, "Ders Programı", "Ödevlerin Verilmesi");
        Content content2 = new Content(2, "1. Gün Sonu Kayıt", "");
        Content content3 = new Content(3, "Ödev 1", "Ödevler..."); // 1. gün

        Content content4 = new Content(4, "Ödev 2", "Ödevler...");
        Content content5 = new Content(5, "Ödev 3", "Ödevler...");
        Content content6 = new Content(6, "Değerlendirme", "Değerlendirme Açıklaması"); // 2. gün


        Content [] contents1 = {
            content1, content2, content3
        };

        Content [] contents2 = {
            content4, content5, content6
        };


        Day day1 = new Day(1, "Gün 1", Arrays.stream(contents1).toList());
        Day day2 = new Day(2, "Gün 2", Arrays.stream(contents2).toList());
        Day day3 = new Day(3, "Gün 3", Arrays.stream(contents2).toList());
        Day day4 = new Day(4, "Gün 4", Arrays.stream(contents2).toList());
        Day day5 = new Day(5, "Gün 5", Arrays.stream(contents2).toList());


        Day [] days = {
            day1, day2
        };

        Camp camp = new Camp(1, "Yazılım Geliştirici Yetiştirme Kampı | Java + React", Arrays.stream(days).toList());

        System.out.println("Kamp :" + camp.name);

        for(Day day : camp.Days) {
            System.out.println("Gün" + day.name);
            for (Content content : day.Contents) {
                System.out.println("İçerik :" + content.title);
            }
        }

        CampManager campManager = new CampManager();
        DayManager dayManager = new DayManager();
        ContentManager contentManager = new ContentManager();

        campManager.addDay(camp, day1);
        dayManager.addContent(day5, content5);
        contentManager.changeTitle(content3, "Yeni Başlık");

    }
}
