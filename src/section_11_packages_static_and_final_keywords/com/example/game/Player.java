package section_11_packages_static_and_final_keywords.com.example.game;

import section_9_inner_abstract_classes_and_interfaces.interfaces.interfaces_Challenge.ISaveable;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String playerName;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String playerName, int hitPoints, int strength) {
        this.playerName = playerName;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.playerName);
        values.add(1, " " + this.hitPoints);
        values.add(2, " " + this.strength);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if (savedValues != null && savedValues.size() > 0){
            this.playerName = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }

    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
