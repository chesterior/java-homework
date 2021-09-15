package ru.igromania;

public class Championships {
    String tournament; // название турнира
    String gameNames; //название игры
    String date; // дата турнира
    String country; // страна проведения

    public Championships(String tournament, String gameNames, String date, String country) {
        this.tournament = tournament;
        this.gameNames = gameNames;
        this.date = date;
        this.country = country;

    }
}
