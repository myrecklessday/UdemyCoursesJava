package section_8_arrays_and_lists.arrays.autoboxing_and_unboxing.challenge;

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

public class Main {


    public static void main(String[] args) {

        Bank bank = new Bank("Belarusian Bank");
        if (bank.addBranch("Minsk")){
            System.out.println("Minsk branch created");
        };
        bank.addCustomer("Minsk", "Kate", 85.55);
        bank.addCustomer("Minsk", "Paul", 25.47);
        bank.addCustomer("Minsk", "Mary", 145.13);

        bank.addBranch("Grodno");
        bank.addCustomer("Grodno", "Bob", 124.43);

        bank.addCustomerTransaction("Minsk", "Kate", 45.88);
        bank.addCustomerTransaction("Minsk", "Kate", 14.10);
        bank.addCustomerTransaction("Minsk", "Mary", 23.24);

        bank.listCustomers("Minsk", true);
        bank.listCustomers("Grodno", true);

//        bank.addBranch("Sydney");
        if (!bank.addCustomer("Sydney", "Lola", 54.22)){
            System.out.println("Error Sydney branch doesn't exist");
        }

        if (!bank.addBranch("Grodno")){
            System.out.println("Grodno branch already exists");
        }

        if (!bank.addCustomerTransaction("Grodno", "Molly", 88)){
            System.out.println("Customer doesn't exist in the branch");
        }

        if (!bank.addCustomer("Minsk", "Kate", 54.22)){
            System.out.println("Customer Kate already exists for that branch");
        }

    }


}
