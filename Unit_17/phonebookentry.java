package CIS2206.Unit_17;
/**
 * Class representing a single entry in a phonebook, with a name, phone number, address, and email.
 */
import java.util.Objects;

public class phonebookentry implements Comparable<phonebookentry> {
    private String full_name;
    private String phone_number;
    private String address;
    private String email;

    /**
     * Constructs a new phonebookentry with the given name, phone number, address, and email.
     *
     * @param full_name    The full name of the contact.
     * @param phone_number The phone number of the contact.
     * @param address      The address of the contact.
     * @param email        The email of the contact.
     */
    public phonebookentry(String full_name, String phone_number, String address, String email) {
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.address = address;
        this.email = email;






    }
    /**
     * Returns the full name of the contact.
     * @return The full name of the contact.
     */
    public String getFull_name() {
        return this.full_name;
    }

    /**
     * Returns the phone number of the contact.
     * @return The phone number of the contact.
     */
    public String getPhone_number() {
        return this.phone_number;
    }

    /**
     * Returns the address of the contact.
     * @return The address of the contact.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Returns the email of the contact.
     * @return The email of the contact.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Returns a string representation of the contact, including their full name, address, email, and phone number.
     * @return A string representation of the contact.
     */
    public String toString() {
        String output = "";
        output += " \n";
        output += "\tFull NAME:: " + this.full_name + "\n";
        output += "\tAddress:: " + this.address + "\n";
        output += "\tEmail:: " + this.email + "\n";
        output += "\tPhone Number:: " + this.phone_number + "\n";

        return output;
    }

    /**
     * Compares this phonebookentry to another based on their full names.
     * @param o The phonebookentry to compare to.
     * @return A negative number if this phonebookentry's full name comes before the other's alphabetically, 0 if they
     * are the same, or a positive number if this phonebookentry's full name comes after the other's alphabetically.
     */
    @Override
    public int compareTo(phonebookentry o) {
        return -this.full_name.compareTo(o.full_name);
    }
}
