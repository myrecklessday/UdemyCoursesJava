package section_9_inner_abstract_classes_and_interfaces.interfaces.inner_classes;

public class MainGear {

    public static void main(String[] args) {

        Gearbox mcLaren = new Gearbox(6);
//        mcLaren.addGear(1, 5.9);
//        mcLaren.addGear(2, 14.5);
//        mcLaren.addGear(3, 8.54);

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));



        //if inner class was public:
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);

        //example of errors when creating inner class objects:
//        Gearbox.Gear second = new Gearbox.Gear(2, 5.5);
//        Gearbox.Gear third = new mcLaren.Gear(3, 5.7);
//        System.out.println(first.driveSpeed(1000));



    }


}
