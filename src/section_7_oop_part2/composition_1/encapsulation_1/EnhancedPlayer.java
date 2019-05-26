package section_7_oop_part2.composition_1.encapsulation_1;

//Class with using Encapsulation
public class EnhancedPlayer {

    private String playerName;
    private int playerHealth = 100;
    private String weapon;

    public EnhancedPlayer(String playerName, int health, String weapon) {
        this.playerName = playerName;
        if (health > 0 && health <= 100){
            this.playerHealth = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.playerHealth = this.playerHealth - damage;
        if (this.playerHealth <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return playerHealth;
    }
}
