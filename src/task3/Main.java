package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         Player player = new Player("Oskar", "Polak", 212);
         Player player2 = new Player("Damian", "Kowalski", 543);

         Game game = new Game(4);

         game.addPlayer(player);
         game.addPlayer(player2);

         System.out.println(Arrays.toString(game.getPlayers()));
    }
}
