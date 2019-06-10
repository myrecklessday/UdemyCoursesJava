package section_7_oop_part2.composition_1.oop_challenge;

public class HealthyBurger extends Hamburger {

    //реализация с именем additional, а не конкретным additional как в Hamburger классе
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private double price;

    public HealthyBurger(String meat, double price){
        super("Healthy burger", "Brown rye bread", meat, price);
        this.price = price;
    }

    public void addAddition1(String name, double price){
        this.addition1Name = name;
        if (price < 0){
            System.out.println("Incorrect " + this.addition1Name + " price!");
        } else {
            this.addition1Price = price;
        }
    }

    public void addAddition2(String name, double price){
        this.addition2Name = name;
        if (price < 0){
            System.out.println("Incorrect " + this.addition2Name + " price!");
        } else {
            this.addition2Price = price;
        }
    }

    @Override
    public double getTotalPrice(){
        double totalPrice = super.getTotalPrice();
        if (this.addition1Name != null){
            totalPrice += this.addition1Price;
            System.out.println(this.addition1Name + " costs " + this.addition1Price);
        }
        if (this.addition2Name != null){
            totalPrice += this.addition2Price;
            System.out.println(this.addition2Price + " costs " + this.addition2Price);
        }
        return totalPrice;
    }

}
