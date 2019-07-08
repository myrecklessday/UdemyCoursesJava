package section_8_arrays_and_lists.arrays.autoboxing_and_unboxing.challenge;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;
    private String bankName;

    public Bank(String bankName){
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();

    }

    public Branch findBranch(String branchName){
        for (int i = 0; i < branches.size(); i++){
            Branch checkedBranch = branches.get(i);
            if (checkedBranch.getBranchName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            Branch newBranch = Branch.createBranch(branchName);
            branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double amount){
        Branch foundBranch = findBranch(branchName);
        if (foundBranch != null){
            return foundBranch.addCustomer(customerName, amount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch foundBranch = findBranch(branchName);
        if (foundBranch != null){
            return foundBranch.addTransactionAmount(customerName, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch foundBranch = findBranch(branchName);
        if (foundBranch != null){
            System.out.println("Branch with name " + foundBranch.getBranchName() + " contains customers: ");
            ArrayList<Customer> branchCustomers = foundBranch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }



}
