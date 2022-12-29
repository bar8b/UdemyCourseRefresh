package e_interface_AbstractClasses.ex2_playerMonster;

import java.util.ArrayList;

public class Monsters implements Savable{
    private String name;
    private int hitPoints;
    private int strenght;


    public Monsters(String name, int hitPoints, int strenght) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strenght = strenght;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strenght);
        return values;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if(savedValues != null && savedValues.size() >0 ){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strenght = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strenght=" + strenght +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrenght() {
        return strenght;
    }
}
