package section_8_arrays_and_lists.arrays.arrayList_Challenge;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contactsArrayList = new ArrayList<Contact>();

    public void printContacts() {
        System.out.println("Contact list: ");
        if (contactsArrayList.size() > 0) {
            for (int i = 0; i < contactsArrayList.size(); i++) {
                System.out.println(contactsArrayList.get(i).getName());
                System.out.println(contactsArrayList.get(i).getPhone());
            }
        } else {
            System.out.println("No contacts in the list");
        }
    }

    private Contact findContact(String name) {
        for (int i = 0; i < contactsArrayList.size(); i++) {
            if (contactsArrayList.get(i).getName().equals(name)) {
                return contactsArrayList.get(i);
            }
        }
        return null;
    }

    public void addContact(Contact contact) {
        if (findContact(contact.getName()) == null){
            contactsArrayList.add(contact);
        }
        else {
            System.out.println("Contact already exists!");
        }
    }

    public void updateContact(String currentName, Contact newContact) {

        Contact currentContact = findContact(currentName);
        if (currentContact != null){
            if (findContact(newContact.getName()) == null){
                int index = contactsArrayList.indexOf(currentContact);
                contactsArrayList.set(index, newContact);
            } else {
                System.out.println("Person with name " + newContact.getName() + " already exists!");
            }
        } else {
            System.out.println("Contact doesn't exist!");
        }

    }

    public void removeContact(String name){
        Contact contact = findContact(name);
        if (contact != null){
            contactsArrayList.remove(contact);
            System.out.println("Contact has been removed");
        } else {
            System.out.println("Contact doesn't exist!");
        }

    }

    public void searchForContract(String name){
        Contact contact = findContact(name);
        if (contact != null){
            System.out.println("Contact " + contact.getName() + " with phone " + contact.getPhone() + " is found in the Mobile Phone :)");
        } else {
            System.out.println("Contact was not found :(");
        }
    }

}
