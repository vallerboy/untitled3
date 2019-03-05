package game;

import java.util.Random;

public class Monster {
    private int attack;
    private int def;
    private int chanceToAttack;
    private String name;
    private static Random random = new Random();


    public Monster(int attack, int def, int chanceToAttack, String name) {
        this.attack = attack;
        this.def = def;
        this.chanceToAttack = chanceToAttack;
        this.name = name;
    }

    /**
     * Description :) this method is really cool !
     * @param player Player.class
     * @return return true if player was attacked, otherwise return false
     */

    public boolean attackPlayer(Player player){
        int randomInt = random.nextInt(100);
        if(chanceToAttack <= randomInt){
            return false;
        }

        player.setDef(player.getDef() - this.getAttack());
        return true;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getChanceToAttack() {
        return chanceToAttack;
    }

    public void setChanceToAttack(int chanceToAttack) {
        this.chanceToAttack = chanceToAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
