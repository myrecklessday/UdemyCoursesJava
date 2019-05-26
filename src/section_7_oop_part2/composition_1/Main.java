package section_7_oop_part2.composition_1;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20,5);
        Case theCase = new Case("2200", "Sony", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 28, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("89-855", "Asus", 4, 6, "v2.55");

        PC pc = new PC(theCase, monitor, motherboard);

        pc.powerUp();


    }
}
