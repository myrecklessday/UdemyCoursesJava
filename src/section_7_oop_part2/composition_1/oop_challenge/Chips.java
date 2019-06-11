package section_7_oop_part2.composition_1.oop_challenge;

public class Chips {

    private String name;
    private double weight;
    private double price;

    public Chips(String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }
}
