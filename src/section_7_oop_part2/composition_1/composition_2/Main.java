package section_7_oop_part2.composition_1.composition_2;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(15, 58);

        Bed bed = new Bed("Retro", 4, 5, 2, 1);

        Lamp lamp = new Lamp("Modern", true, 76);

        Room bedRoom = new Room("Lana's bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedRoom.getLamp().turnOn();
        bedRoom.makeBed();

    }

}
