package section_6_inheritance.challenge1;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private boolean isManual;
    private int gears;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, boolean isManual, int gears) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.gears = gears;
        this.currentGear = 1;
    }

    public int getCurrentGear(){
        return currentGear;
    }

    public void setCurrentGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }

}
