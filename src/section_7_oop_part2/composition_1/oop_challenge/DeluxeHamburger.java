package section_7_oop_part2.composition_1.oop_challenge;

public class DeluxeHamburger extends Hamburger {

    private Chips chips;
    private Drinks drinks;

    public DeluxeHamburger(String breadRollType, String meat, double price, Chips chips, Drinks drinks){
        super("Deluxe hamburger", breadRollType, meat, price);
        // Version with composition:
        this.chips = chips;
        this.drinks = drinks;
    }

    public DeluxeHamburger(String breadRollType, String meat, double price){
        super("Deluxe hamburger", breadRollType, meat, price);
        // Version with inheritance using super:
        super.addHamburgerAddition1("Chips", 4.8);
        super.addHamburgerAddition2("Drinks", 1.4);
    }

    //Uncomment Overriding if there is need to use Composition
//    @Override
//    public double getTotalPrice(){
//        double totalPrice = getBasePrice();
//        System.out.println(this.getName() + " on a " + this.getBreadRollType() + " roll " +
//                "with " + this.getMeat() + ". Price is " + this.getBasePrice());
//        if (chips.getName() != null){
//            System.out.println("Chips " + chips.getName() + " cost " + chips.getPrice());
//            totalPrice += chips.getPrice();
//        }
//        if (drinks.getName() != null){
//            System.out.println("Drink " + drinks.getName() + " costs " + drinks.getPrice());
//            totalPrice += drinks.getPrice();
//        }
//        return totalPrice;
//    }

    @Override
    public void addTomato(double price) {
        System.out.println("Cannot add Tomato to Deluxe burger");
    }

    @Override
    public void addLettuce(double price) {
        System.out.println("Cannot add Lettuce to Deluxe burger");
    }

    @Override
    public void addOnion(double price) {
        System.out.println("Cannot add Onion to Deluxe burger");
    }

    @Override
    public void addCarrot(double price) {
        System.out.println("Cannot add Carrot to Deluxe burger");
    }
}
