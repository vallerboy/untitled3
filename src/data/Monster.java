package data;

import java.util.Objects;
import java.util.Random;

public class Monster {
    private String name;
    private int attack;
    private int critical;
    private int def;

    public Monster(String name, int attack, int def) {
        this.name = name;
        this.attack = attack;
        this.def = def;

        critical = (attack - def / 10) % 100;
    }

    public int tryAttack() {
        Random random = new Random();

        if(critical >= random.nextInt(100)){
            return attack * 2;
        }
        return attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return attack == monster.attack &&
                critical == monster.critical &&
                def == monster.def &&
                Objects.equals(name, monster.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, attack, critical, def);
    }
}
