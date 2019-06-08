package section_7_oop_part2.composition_1.polymorphism_2;

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

class Car{
    private String name;
    private boolean engine;
    private int cylindres;
    private int wheels;

    public Car(String name, int cylindres){
        this.name = name;
        this.engine = true;
        this.cylindres = cylindres;
        this.wheels = 4;
    }

    public String getName(){
        return name;
    }
    public int getCylindres(){
        return cylindres;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}

class Jaguar extends Car{

    public Jaguar(String name, int cylindres){
        super(name, cylindres);
    }

    @Override
    public String startEngine(){
        return "Jaguar -> startEngine()";
    }
    @Override
    public String accelerate(){
        return "Jaguar -> accelerate()";
    }
    @Override
    public String brake(){
        return "Jaguar -> brake()";
    }
}

class Porsche extends Car{
    public Porsche(String name, int cylindres){
        super(name, cylindres);
    }

    @Override
    public String startEngine(){
        return "Porsche -> startEngine()";
    }
    @Override
    public String accelerate(){
        return "Porsche -> accelerate()";
    }
    @Override
    public String brake(){
        return "Porsche -> brake()";
    }
}

class Renault extends Car{
    public Renault(String name, int cylindres){
        super(name, cylindres);
    }

    @Override
    public String startEngine(){
        return getClass().getSimpleName() + " -> startEngine()";
    }
    @Override
    public String accelerate(){
        return getClass().getSimpleName() + " -> accelerate()";
    }
    @Override
    public String brake(){
        return getClass().getSimpleName() + " -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Porsche porsche = new Porsche("Porsche S43", 5);
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());

        Jaguar jaguar = new Jaguar("M 45", 5);
        System.out.println(jaguar.startEngine());
        System.out.println(jaguar.accelerate());
        System.out.println(jaguar.brake());

        Renault renault = new Renault("Kaptur", 4);
        System.out.println(renault.startEngine());
        System.out.println(renault.accelerate());
        System.out.println(renault.brake());

    }

}
