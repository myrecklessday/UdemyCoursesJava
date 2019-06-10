package section_7_oop_part2.composition_1.oop_challenge;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double tomatoPrice;
    private double onionPrice;
    private double lettucePrice;
    private double carrotPrice;

    private double price = 2.5;

    public Hamburger(String name, String breadRollType, String meat, double price){
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        if (price >= 0){
            this.price = price;
        }
    }

    public void addTomato(double price){
        if (price < 0){
            System.out.println("Incorrect tomato price!");
        } else {
            this.tomatoPrice = price;
        }
    }

    public void addLettuce(double price){
        if (price < 0){
            System.out.println("Incorrect lettuce price!");
        } else {
            this.lettucePrice = price;
        }    }

    public void addOnion(double price){
        if (price < 0){
            System.out.println("Incorrect onion price!");
        } else {
            this.onionPrice = price;
        }    }

    public void addCarrot(double price){
        if (price < 0){
            System.out.println("Incorrect carrot price!");
        } else {
            this.carrotPrice = price;
        }
    }


    public double getTotalPrice(){
        double totalPrice = this.price;
        System.out.println(this.name + " hamburger" + " on a " + this.breadRollType + " roll " +
                "with " + this.meat + ". Price is " + this.price);
        if (this.tomatoPrice > 0){
            totalPrice += this.tomatoPrice;
            System.out.println("Tomato price is " + this.tomatoPrice);
        }
        if (this.onionPrice > 0){
            totalPrice += this.onionPrice;
            System.out.println("Onion price is " + this.onionPrice);
        }
        if (this.carrotPrice > 0){
            totalPrice += this.carrotPrice;
            System.out.println("Carrot price is " + this.carrotPrice);
        }
        if (this.lettucePrice > 0){
            totalPrice += this.lettucePrice;
            System.out.println("Lettuce price is " + this.lettucePrice);
        }
        return totalPrice;
    }

    public String getName(){
        return name;
    }

    public double getBasePrice() {
        return price;
    }

//    public void setCarrotPrice(double carrotPrice) {
//        this.carrotPrice = carrotPrice;
//    }
}
