package section_8_arrays_and_lists.arrays.arrayList_Challenge;

import java.util.ArrayList;

public class MobilePhone {

    ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();

    public void printContacts() {
        System.out.println("Contact list: ");
        if (contactsArrayList.size() > 0) {
            for (int i = 0; i < contactsArrayList.size(); i++) {
                System.out.println(contactsArrayList.get(i));
            }
        } else {
            System.out.println("No contacts in the list");
        }
    }

    public void addContact(Contacts contact){
        contactsArrayList.add(contact);
    }

}
