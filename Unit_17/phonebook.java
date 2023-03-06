package CIS2206.Unit_17;

/**
 * Class representing a phonebook, which stores contact information using a map.
 */
import java.util.HashMap;
import java.util.Map;

public class phonebook {
    private Map<String, phonebookentry> myMap = new HashMap<>();

    /**
     * Returns a string representation of the phonebook, including a list of all the contacts.
     * @return A string representation of the phonebook.
     */
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Contacts: ");

        for (phonebookentry value : myMap.values()) {
            output.append(value);
        }
        return output.toString();


    }




    /**
     * Adds a new contact to the phonebook.
     * @param full_name The full name of the contact.
     * @param phone_number The phone number of the contact.
     * @param address The address of the contact.
     * @param email The email of the contact.
     */
    public void addContact(String full_name, String phone_number, String address, String email) {
        phonebookentry contact1 = new phonebookentry(full_name, phone_number, address, email);
        this.myMap.put(full_name, contact1);
    }

    /**
     * Removes a contact from the phonebook.
     * @param full_name The full name of the contact to remove.
     */
    public void remove(String full_name) {
        if (myMap.containsKey(full_name)) {
            myMap.remove(full_name);
        }
    }

    /**
     * Replaces a contact's information in the phonebook.
     * @param full_name The full name of the contact to update.
     * @param phone_number The new phone number of the contact.
     * @param address The new address of the contact.
     * @param email The new email of the contact.
     */
    public void replace(String full_name, String phone_number, String address, String email) {
        phonebookentry contact1 = new phonebookentry(full_name, phone_number, address, email);
        if (myMap.containsKey(full_name)) {
            myMap.replace(full_name, contact1);
        }
    }

    /**
     * Prints a single entry from the phonebook.
     * @param full_name The full name of the contact to print.
     */
    public void printSingleEntry(String full_name) {
        if (myMap.containsKey(full_name)) {
            System.out.println(this.myMap.get(full_name));

        }
    }



}








