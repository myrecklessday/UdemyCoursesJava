package section_7_oop_part2.composition_1.oop_challenge;

public class Tomato {
    private double price = 0;

    public Tomato(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
