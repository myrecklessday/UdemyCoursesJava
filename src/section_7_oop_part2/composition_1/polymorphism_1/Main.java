package section_7_oop_part2.composition_1.polymorphism_1;

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    public String plot(){
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }
    public String plot(){
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }
    public String plot(){
        return "Imperia forces try to take over the universe";
    }
}

class Forgatable extends Movie {
    public Forgatable(){
        super("Forgatable");
    }

}

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgatable();
        }

        return null;
    }

}
