package CIS2206.Unit_17;

/**
 * Main class for the phonebook program.
 */
public class user {
    /**
     * Main method that creates a phonebook and adds, removes, and updates contacts in it.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        phonebook A = new phonebook();
        // Add some contacts to the phonebook
        A.addContact("Jane lopez ", "07736784646","610 huddersfield road dewsbury ", "manig089532@gmail.com");
        A.addContact("Joe root", "09787846464","25 hull street Ravenshall dewsbury","joe£dave@hotmail.com");
        A.addContact("Zakria chattha","009677750785","12 mill street dewsbury ","zakriachattha0@gmail.com");
        System.out.println("Phonebook");
        System.out.println(A);
        // Remove a contact from the phonebook
        A.remove("Zakria chattha");
        System.out.println("\n Phonebook after removing one contact");
        System.out.println(A);
        // Update a contact in the phonebook
        A.replace("Joe root","07740785656","12 mill street","joe£dave@hotmail");
        System.out.println("\n Phonebook after updating one contact");
        System.out.println(A);
        System.out.println("\n Printing single entry as per request");
        //pse(printing single entry)accessing is a function to print single contact from  phonebook
        A.printSingleEntry("Joe root");
    }
}
