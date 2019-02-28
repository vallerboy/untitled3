package task3;

public class Game {
    private Player[] players;


    public Game(int playerCount){
        players = new Player[playerCount];
    }


    public void addPlayer(Player player){
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;
                break;
            }
        }
    }

    public Player winner(){
        Player actualMax = players[0];
        for (int i = 0; i < players.length; i++) {
             if(players[i] != null && players[i].getPoints() > actualMax.getPoints()){
                 actualMax = players[i];
             }
        }
        return actualMax;
    }

    public void deletePlayer(Player player){
        for (int i = 0; i < players.length; i++) {
             if(player.equals(players[i])){
                  players[i] = null;
                  break;
             }
        }
    }

    public Player[] getPlayers(){
        return players;
    }
}
