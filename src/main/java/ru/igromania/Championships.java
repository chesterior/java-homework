package ru.igromania;

public class Championships {
    String tournament; // название турнира
    String gameNames; //название игры
    String date; // дата турнира
    String country; // страна проведения
    Gamers [] participants; // список участников

    public Championships(String tournament, String gameNames, String date, String country) {
        this.tournament = tournament;
        this.gameNames = gameNames;
        this.date = date;
        this.country = country;
    }

    public void ListOfParticipants(Gamers[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].name + " " + list[i].team + " " + list[i].country);
        }
    }
}
