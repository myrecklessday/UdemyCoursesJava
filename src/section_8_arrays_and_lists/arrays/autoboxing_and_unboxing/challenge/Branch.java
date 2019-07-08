package section_8_arrays_and_lists.arrays.autoboxing_and_unboxing.challenge;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;
    private String branchName;

    public Branch(String branchName){
        this.customers = new ArrayList<Customer>();

        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static Branch createBranch(String branchName){
        return new Branch(branchName);
    }

//    private int findCustomer(String name){
//        for (int i = 0; i <= customers.size(); i++){
//            if (customers.get(i).getName().equals(name)){
//                System.out.println("Customer with this name is found");
//                return i;
//            }
//        }
//        return -1;
//    }

    private Customer findCustomer(String name){
        for (int i = 0; i < customers.size(); i++){
            Customer checkCustomer = customers.get(i);
            if (checkCustomer.getName().equals(name)){
                System.out.println("Customer with this name is found");
                return checkCustomer;
            }
        }
        return null;
    }

//    public boolean addCustomer(Customer customer){
//        if (findCustomer(customer.getName()) >= 0){
//            System.out.println("Customer with this name already exists!");
//            return false;
//        }
//        customers.add(customer);
//        return true;
//    }

    public boolean addCustomer(String name, double amount){
        if (findCustomer(name) != null){
            System.out.println("Customer with this name already exists!");
            return false;
        }

        customers.add(Customer.createCustomer(name, amount));
        return true;
    }

    public boolean addTransactionAmount(String customerName, double amount){
        Customer foundCustomer = findCustomer(customerName);
        if (foundCustomer == null){
            System.out.println("Customer doesn't exist! Impossible to add transaction");
            return false;
        }
        foundCustomer.addTransaction(amount);
        return true;

    }

//    public void printCustomers(){
//        for (int i = 0; i < customers.size(); i++){
//            System.out.println("Name: " + customers.get(i).getName() + " Transactions: " + customers.get(i).getTransactions());
//        }
//    }

}
