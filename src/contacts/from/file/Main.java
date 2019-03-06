package contacts.from.file;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Database database = null;
        try {
             database = new Database();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Aktualne kontakty: ");

        for (Contact contact : database.getContactList()) {
            System.out.println(contact.getName() + " " + contact.getNumber());
        }

        Contact contact = new Contact("Oskar", "788848839");
        database.addContact(contact);


        try {
            database.saveContacts();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
