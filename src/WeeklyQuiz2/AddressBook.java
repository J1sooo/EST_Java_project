package WeeklyQuiz2;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact> contacts = new ArrayList<>();

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            for (Contact contact : contacts) {
                contact.Print();
            }
        }
    }

    public void searchContact(String name) {
        List<Contact> searchName = contacts.stream().filter(x -> x.getName().equals(name)).toList();
        if (searchName.isEmpty()) {
            System.out.println("연락처를 찾을 수 없습니다.");
        } else {
            for (Contact contact : searchName) {
                contact.Print();
            }
        }
    }
}
