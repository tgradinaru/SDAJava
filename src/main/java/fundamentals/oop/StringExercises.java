package fundamentals.oop;

import java.util.Scanner;

public class StringExercises {
    /**
     * Write a Java program to get the character at the given index within the String
     */
    public static void charAtIndexInString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a phrase and press Enter");
        String newString = scanner.nextLine();
        int charNumber = 0;
        do {
            System.out.println("Which character in your phrase should be returned? Input a value between 1 and "
                    + newString.length());
            charNumber = scanner.nextInt();
        } while (charNumber < 1 || charNumber > newString.length());
        System.out.println("Found char at " + charNumber + " position is '" + newString.charAt(charNumber - 1) + "'");
    }

    /**
     * Write a Java program to test if a given string contains the specified sequence of char values (another string).
     */
    public static void stringInString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a phrase and press Enter");
        String originalString = scanner.nextLine();
        System.out.println("Please type a word or group of characters to search it in your phrase ");
        String newString = scanner.next();
        if (!originalString.contains(newString)) {
            System.out.println(newString + " isn't found in above phrase");
            return;
        }
        System.out.println("We found '" + newString + "'in above phrase");
    }

    /**
     * Write a Java program to replace a specified character with another character in a string.
     */
    public static void replaceACharacterInString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a phrase and press Enter");
        String originalString = scanner.nextLine();
        String newString = originalString.replace("a", "XXXX");//I know we cat take them from user
        System.out.println("We replaced 'a' with 'bbb' and the result is: " + newString);
    }

    /**
     * Write a Java program to uppercase first letter of every word in a text(string).
     */

    // i didn't succeeded :((
    public static void firstLetterUpperCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a phrase and press Enter");
        String userString = scanner.nextLine();
        char[] charArray = userString.toCharArray();
        int k = 1;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (k == 1) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    k = 0;
                }
            } else {
                k = 0;
            }
        }
        userString = String.valueOf(charArray);
        System.out.println(userString);
    }

    /**
     * Write a Java program to compare 2 strings ignoring case consideration.  (e.g: “Dog” is equal to “dOG”)
     */
    public static void compareTwoStringsWithoutCase(String a, String b) {
        if (!a.toLowerCase().equals(b.toLowerCase())) {
            System.out.println("The two strings are NOT identical without upperCase");
        } else {
            System.out.println("The two strings are identical without upperCase");
        }
    }
}
