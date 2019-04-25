public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Kitty", 248.44, "kitty@gmail.com");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "meow@meow.by");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }

}
