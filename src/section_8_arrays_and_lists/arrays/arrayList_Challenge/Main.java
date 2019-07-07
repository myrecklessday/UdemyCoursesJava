package section_8_arrays_and_lists.arrays.arrayList_Challenge;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contact (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contact
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean k = false;
        int choice = 0;
        printOptions();

        while (!k){
            System.out.println("Enter your choice: \r");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printOptions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addRecord();
                    break;
                case 3:
                    updateRecord();
                    break;
                case 4:
                    removeRecord();
                    break;
                case 5:
                    findRecord();
                    break;
                case 6:
                    k = true;
                    break;

            }

        }
    }

    public static void printOptions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of Contact.");
        System.out.println("\t 2 - To add a Contact to the list.");
        System.out.println("\t 3 - To update a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addRecord(){
        System.out.println("Enter the person's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the person's phone:");
        String phone = scanner.nextLine();
//        Contact contact = new Contact(name, phone);
        Contact contact = Contact.createContact(name, phone);
        if (mobilePhone.addContact(contact)){
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Contact with name " + name + " already exists!");
        }
    }

    public static void updateRecord(){

        System.out.println("Enter name to update contact:");
        String name = scanner.nextLine();
        if (!mobilePhone.searchForContract(name)){
            System.out.println("Contact doesn't exist!");
            return;
        }

        System.out.println("Enter new name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone:");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);

        if (mobilePhone.updateContact(name, newContact)){
            System.out.println("Contact with name " + name + " was updated to name = " + newName + ", phone = " + newPhone);
        } else {
            System.out.println("Update was not successful");
        }

    }

    public static void removeRecord(){
        System.out.println("Enter the record name you want to remove:");
        String name = scanner.nextLine();
        if (mobilePhone.removeContact(name)){
            System.out.println("Contact with name " + name + " has been removed");
        } else {
            System.out.println("Contact doesn't exist!");
        }
    }

    public static void findRecord(){
        System.out.println("Enter the name you want to find:");
        String name = scanner.nextLine();
        if (mobilePhone.searchForContract(name)){
            System.out.println("Contact " + name + " is found in the Mobile Phone :)");
        } else {
            System.out.println("Contact was not found :(");
        }
    }

}
