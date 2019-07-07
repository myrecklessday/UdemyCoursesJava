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
                System.out.println("**********");
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

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) == null){
            contactsArrayList.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(String currentName, Contact newContact) {

        Contact currentContact = findContact(currentName);
        if (currentContact != null){
            if (findContact(newContact.getName()) == null){
                int index = contactsArrayList.indexOf(currentContact);
                contactsArrayList.set(index, newContact);
                return true;
            } else {
                    System.out.println("Person with name " + newContact.getName() + " already exists!");
                    return false;
            }
        }
        return false;

    }

    public boolean removeContact(String name){
        Contact contact = findContact(name);
        if (contact != null){
            contactsArrayList.remove(contact);
            return true;
        }
        return false;
    }

    public boolean searchForContract(String name){
        Contact contact = findContact(name);
        if (contact != null){
            System.out.println("Contact " + contact.getName() + " with phone " + contact.getPhone() + " is found in the Mobile Phone :)");
            return true;
        }
        return false;
    }

}
