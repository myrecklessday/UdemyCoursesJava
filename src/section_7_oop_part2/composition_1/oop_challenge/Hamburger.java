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

    public int countAdditionals(){
        for ( int count = 0;  ;count++){



            return count;
        }
    }

    public void addTomato(double price){
        this.tomatoPrice = price;
    }

    public void addLettuce(double price){
        this.lettucePrice = price;
    }

    public void addOnion(double price){
        this.onionPrice = price;
    }

    public void addCarrot(double price){
        this.carrotPrice = price;
    }


    public double getBasePrice() {
        return price;
    }

    public double getTotalPrice(){

        return getBasePrice() + getCarrotPrice() + getLettucePrice() + getOnionPrice() + getTomatoPrice();
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

//    public void setTomatoPrice(double tomatoPrice) {
//        this.tomatoPrice = tomatoPrice;
//    }

    public double getOnionPrice() {
        return onionPrice;
    }

//    public void setOnionPrice(double onionPrice) {
//        this.onionPrice = onionPrice;
//    }

    public double getLettucePrice() {
        return lettucePrice;
    }

//    public void setLettucePrice(double lettucePrice) {
//        this.lettucePrice = lettucePrice;
//    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

//    public void setCarrotPrice(double carrotPrice) {
//        this.carrotPrice = carrotPrice;
//    }
}
