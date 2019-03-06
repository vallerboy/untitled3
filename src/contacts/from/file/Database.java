package contacts.from.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Contact> contactList;
    private File databaseFile;

    public Database() throws IOException {
        contactList = new ArrayList<>();
        databaseFile = Paths.get("C:\\asd\\phones.txt").toFile();

        loadContacts();
    }

    private void loadContacts() throws IOException {
        List<String> lines =  Files.readAllLines(databaseFile.toPath());

        for (String line : lines) {
             String[] splitedContact = line.split(":");

             Contact contact = new Contact(splitedContact[0], splitedContact[1]);
             contactList.add(contact);
        }
    }


    public void saveContacts() throws IOException {
        StringBuilder contactsAsString = new StringBuilder();
        for (Contact contact : contactList) {
            contactsAsString.append(contact.getName()).append(":").append(contact.getNumber());
        }

        Files.write(databaseFile.toPath(), contactsAsString.toString().getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
    }

    public void addContact(Contact contact){
        contactList.add(contact);
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public File getDatabaseFile() {
        return databaseFile;
    }
}
