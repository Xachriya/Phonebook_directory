package CIS2206.Unit_17;

import java.math.BigInteger;

/**
 * Implements five hash function methods
 *
 * @author Ilias Tachmazidis
 * @version September 2022
 */
public class HashFunctions {

    static String[] keys = {"Acid", "Bit", "Byte", "Club", "Copy", "Data", "Hear",
            "Hire", "Hold", "Zoo"};

    static String[] anagrams = {"stop", "post", "opts", "pots", "spot", "tops",
            "emit", "item", "mite", "time"};

    static int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    /**
     * Translates the key into string's length
     *
     * @param key Given key
     * @return Corresponding hash value
     */
    public static int hashFunctionMethod1(String key) {
        return key.length();
    }

    /**
     * Translates the key into string's length
     *
     * @param key Given key
     * @return Corresponding hash value
     */
    public static int hashFunctionMethod2(String key) {
        return key.charAt(0);
    }

    /**
     * Translates the key into the sum of ASCII codes of string's characters
     *
     * @param key Given key
     * @return Corresponding hash value
     */
    public static int hashFunctionMethod3(String key) {
        char[] chars = key.toCharArray();
        int result = 0;
        for (char c : chars) {
            result += c;
        }
        return Math.abs(result);
    }

    /**
     * Translates the key into powers of increasing prime numbers, and
     * then take the product
     *
     * @param key Given key
     * @return Corresponding hash value
     */
    public static int hashFunctionMethod4(String key) {
        char[] chars = key.toCharArray();
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 0; i < chars.length; i++) {
            BigInteger prime = BigInteger.valueOf(primeNumbers[i]);
            BigInteger power = prime.pow(chars[i]);
            result = result.multiply(power);
        }
        return Math.abs(result.hashCode());
    }

    /**
     * Translates the key based on Java's hash function
     *
     * @param key Given key
     * @return Corresponding hash value
     */
    public static int hashFunctionMethod5(String key) {
        return Math.abs(key.hashCode());
    }

    /**
     * Prints the array as a histogram
     *
     * @param method Hash function method
     * @param array Array of counted elements
     */
    public static void printArray(String method, int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(method + ": array[" + i + "]: ");
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("***** Raw hash values *****\n");

        for (String key : keys) {
            int value = hashFunctionMethod1(key);
            System.out.println("Method 1: (key,value): " + key + ", " + value);
        }

        System.out.println();

        for (String key : keys) {
            int value = hashFunctionMethod2(key);
            System.out.println("Method 2: (key,value): " + key + ", " + value);
        }

        System.out.println();

        for (String key : keys) {
            int value = hashFunctionMethod3(key);
            System.out.println("Method 3: (key,value): " + key + ", " + value);
        }

        System.out.println();

        for (String key : anagrams) {
            int value = hashFunctionMethod3(key);
            System.out.println("Method 3 (anagrams): (key,value): " + key + ", " + value);
        }

        System.out.println();

        for (String key : keys) {
            int value = hashFunctionMethod4(key);
            System.out.println("Method 4: (key,value): " + key + ", " + value);
        }

        System.out.println();

        for (String key : keys) {
            int value = hashFunctionMethod5(key);
            System.out.println("Method 5: (key,value): " + key + ", " + value);
        }

        System.out.println();

        for (String key : anagrams) {
            int value = hashFunctionMethod5(key);
            System.out.println("Method 5 (anagrams): (key,value): " + key + ", " + value);
        }

        ///////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////

        System.out.println("\n\n***** Trimmed hash values *****\n");

        int size = 11;

        int[] array = new int[size];

        for (String key : keys) {
            int value = hashFunctionMethod1(key);
            array[value % array.length] += 1;
        }

        printArray("Method 1", array);

        System.out.println();

        array = new int[size];

        for (String key : keys) {
            int value = hashFunctionMethod2(key);
            array[value % array.length] += 1;
        }

        printArray("Method 2", array);

        System.out.println();

        array = new int[size];

        for (String key : keys) {
            int value = hashFunctionMethod3(key);
            array[value % array.length] += 1;
        }

        printArray("Method 3", array);

        System.out.println();

        array = new int[size];

        for (String key : anagrams) {
            int value = hashFunctionMethod3(key);
            array[value % array.length] += 1;
        }

        printArray("Method 3 (anagrams)", array);

        System.out.println();

        array = new int[size];

        for (String key : keys) {
            int value = hashFunctionMethod4(key);
            array[value % array.length] += 1;
        }

        printArray("Method 4", array);

        System.out.println();

        array = new int[size];

        for (String key : keys) {
            int value = hashFunctionMethod5(key);
            array[value % array.length] += 1;
        }

        printArray("Method 5", array);

        System.out.println();

        array = new int[size];

        for (String key : anagrams) {
            int value = hashFunctionMethod5(key);
            array[value % array.length] += 1;
        }

        printArray("Method 5 (anagrams)", array);

    }
}
