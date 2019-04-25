public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
     //   System.out.println("Model is " + porsche.getModel());
        porsche.setModel("888");
        System.out.println("Model is " + porsche.getModel());

        ////Bank account
        BankAccount bankAccount1 = new BankAccount(); //(2, 0.00, "Lena",
              //  "test@test.com", "251222222");
        System.out.println(bankAccount1.getAccountNumber());
        System.out.println(bankAccount1.getBalance());

        bankAccount1.setAccountNumber(1);
        bankAccount1.setBalance(52);
        bankAccount1.setCustomerName("Lena");
        bankAccount1.setEmail("jgjkrf");
        bankAccount1.setPhoneNumber("32323");

        System.out.println("Account number " + bankAccount1.getAccountNumber() + ", balance = " + bankAccount1.getBalance() +
                ", customer name = " + bankAccount1.getCustomerName() + ", email = " + bankAccount1.getEmail() +
                ", phone number = " + bankAccount1.getPhoneNumber());

       // System.out.println(bankAccount1.depositFunds(885));
       // System.out.println(bankAccount1.withdrawFunds(53));

        bankAccount1.depositFunds(58);
        bankAccount1.withdrawFunds(2);
        bankAccount1.withdrawFunds(52);
        bankAccount1.withdrawFunds(56.01);

        BankAccount bankAccount2 = new BankAccount("Karen", "karen@gmaiil.com", "4445555");
        System.out.println(bankAccount2.getAccountNumber() + " name " + bankAccount2.getCustomerName());

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName() + " has credit limit " + customer1.getCreditLimit() + ", email: " + customer1.getEmail());

        VipCustomer customer2 = new VipCustomer("Bob", 125.77);
        System.out.println(customer2.getName() + " has credit limit " + customer2.getCreditLimit() + ", email: " + customer2.getEmail());

        VipCustomer customer3 = new VipCustomer("Matt", 51.77, "matty@tut.by");
        System.out.println(customer3.getName() + " has credit limit " + customer3.getCreditLimit() + ", email: " + customer3.getEmail());

    }

}
