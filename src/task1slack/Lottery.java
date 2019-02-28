package task1slack;

import java.util.Random;

public class Lottery {
    private Player[] players; //Player{Oskar, 25} , Player{Damian, 255},
    private String lotteryName;
    private Random random;

    public Lottery(String lotteryName, Player[] names){
        this.players = names;
        this.lotteryName = lotteryName;
        this.random = new Random();
    }

    public Lottery(String lotteryName, int nameCount){
        this(lotteryName, new Player[nameCount]);
    }

    public void addPlayer(Player name){
        for (int i = 0; i < players.length; i++) {
            if(players[i] != null && players[i].equals(name)){
                players[i] = name;
                break;
            }
        }
    }

    private int calculatePresentPlayersInList(){
        int count = 0;
        for (Player player : players) {
            if(player != null){
                count++;
            }
        }
        return count;
    }

    private int calculatePercentFor(int a){
        int howManyCount = 0;
        for (Player player : players) {
            if(player != null && player.getAge() == a){
                howManyCount ++;
            }
        }

        return howManyCount / calculatePresentPlayersInList() * 100;
    }

    public Winner lottery(){
        Player winner = players[random.nextInt(players.length)];
        return new Winner(winner, calculatePercentFor(winner.getAge()));
    }

}
