package e_interface_AbstractClasses.ex2_playerMonster;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;

public class Player implements Savable {
    private String name;
    private int hitPoints;
    private int strengh;
    private String weapon;

    public Player(String name, int hitPoints, int strengh) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strengh = strengh;
        this.weapon = "Sword";

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strengh=" + strengh +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strengh);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strengh = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrengh() {
        return strengh;
    }

    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
