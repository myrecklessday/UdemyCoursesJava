package section_8_arrays_and_lists.arrays.autoboxing_and_unboxing.challenge;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public static Customer createCustomer(String name, double initialAmount){
        return new Customer(name, initialAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

}
