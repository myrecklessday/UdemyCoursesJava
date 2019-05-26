package section_7_oop_part2.composition_1.encapsulation_1;

//Class without using Encapsulation
public class Player {

    public String playerNameFull;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}
