package game;

import java.util.Random;

public class Player {
    private int attack;
    private int def;
    private int chanceToCriticalAttack;
    private String name;
    private static Random random = new Random();

    public Player(int attack, int def, int chanceToCriticalAttack, String name) {
        this.attack = attack;
        this.def = def;
        this.chanceToCriticalAttack = chanceToCriticalAttack;
        this.name = name;
    }

    public boolean attackMonster(Monster monster){
        int seed = random.nextInt(100);
        if(chanceToCriticalAttack >= seed){
            monster.setDef(0);
            return true;
        }

        monster.setDef(monster.getDef() - this.getAttack());
        return false;
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

    public int getChanceToCriticalAttack() {
        return chanceToCriticalAttack;
    }

    public void setChanceToCriticalAttack(int chanceToCriticalAttack) {
        this.chanceToCriticalAttack = chanceToCriticalAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        Player.random = random;
    }
}
