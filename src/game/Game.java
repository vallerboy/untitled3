package game;

public class Game {
    public static void main(String[] args) {
        new Game().start();
    }

    private void start() {
        Monster crazyOrc = new Monster(60, 1600, 1, "Orc");
            Player player = new Player(25, 600, 1, "Oskar");

        while (crazyOrc.getDef() > 0 && player.getDef() > 0){

            crazyOrc.attackPlayer(player);
            player.attackMonster(crazyOrc);

            System.out.println("Życie gracza: " + player.getDef());
            System.out.println("Życie monstera: " + crazyOrc.getDef());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println();
        }
    }
}
