package section_7_oop_part2.composition_1.oop_challenge;

public class Drinks {

    private String name;
    private double volume;
    private boolean isCarbonated;
    private double price;

    public Drinks(String name, double volume, boolean isCarbonated, double price){
        this.name = name;
        this.volume = volume;
        this.isCarbonated = isCarbonated;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }
}
