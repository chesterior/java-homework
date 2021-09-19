package ru.igromania;

public class Championships {
    String tournament; // название турнира
    String gameNames; //название игры
    String date; // дата турнира
    String country; // страна проведения
    Gamers[] participants; // список участников

    public Championships(String tournament, String gameNames, String date, String country) {
        this.tournament = tournament;
        this.gameNames = gameNames;
        this.date = date;
        this.country = country;
    }

    public void ListOfParticipants(Gamers[] gamers){
        for (int i = 0; i < gamers.length; i++) {
            System.out.println(gamers[i].name + " " + gamers[i].team + " " + gamers[i].country);
        }
    }
}
