package ru.igromania;

public class Main {
    public static void main(String[] args) {

        Gamers[] listGamers1 = new Gamers[4]; // список игроков на первый турнир
        Gamers[] listGamers2 = new Gamers[6]; // список игроков на второй турнир

        listGamers1[0] = new Gamers("Zloy", "Olimp", "Russia");
        listGamers1[1] = new Gamers("Killer", "Olimp", "Russia");
        listGamers1[2] = new Gamers("Neo", "Marvel", "USA");
        listGamers1[3] = new Gamers("Tron", "Marvel", "USA");

        listGamers2[0] = new Gamers("Zloy", "Olimp", "Russia");
        listGamers2[1] = new Gamers("Killer", "Olimp", "Russia");
        listGamers2[2] = new Gamers("Ivan", "Olimp", "Russia");
        listGamers2[3] = new Gamers("Neo", "Marvel", "USA");
        listGamers2[4] = new Gamers("Tron", "Marvel", "USA");
        listGamers2[5] = new Gamers("Lex", "Marvel", "USA");

        //создаём 2 турнира
        Championships fifa = new Championships("Fifa World", "Fifa", "16.09.2022", "USA");
        Championships counterStrike = new Championships("Mochilovo", "Counter-Strike", "22.12.2021", "Russia");

        //информация о первом турнире
        System.out.println("Tournament" + " " + fifa.tournament + " " + "will be conducted by" + " " + fifa.date + ". " + "list of players who participate" + " ");
        for (int i = 0; i < listGamers1.length; i++) {
            System.out.println(listGamers1[i]);
        }

        //информация о втором турнире
        System.out.println("Tournament" + " " + counterStrike.tournament + " " + "will be conducted by" + " " + counterStrike.date + ". " + "list of players who participate" + " ");
        for (int i = 0; i < listGamers2.length; i++) {
            System.out.println(listGamers2[i]);
        }
    }
}
