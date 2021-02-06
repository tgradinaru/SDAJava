package fundamentals;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_and_Strings {
    /**
     * Write a Java program to find maximum product of two integers in a given array of integers.
     * Example: nums = { 2, 3, 5, 7, -7, 5, 8, -5 } => Pair is (7, 8), Maximum Product: 56
     */
    public static void maxProductFromIntArray() {
        int[] intArray = {2, 3, 5, 7, -7, 5, 8, -5};
        int maxProduct = 0;
        for (int i = 0; i < (intArray.length - 1); i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (maxProduct < intArray[i] * intArray[j]) {
                    maxProduct = intArray[i] * intArray[j];
                }
            }
        }
        System.out.println("Maximum Product: " + maxProduct);
    }

    /**
     * Write a Java program to test if an array of strings contains a specific value.
     */
    public static void specificValueInAStringArray() {
        String[] stringsArray = {"This", "is", "a", "very", "good", "question", "and", "very", "funny"};
        System.out.print("We have the following strings Array: \n");
        System.out.println(Arrays.toString(stringsArray));
        System.out.println("\nWhat WORD do you want to search?" +
                "\n Warning: we search Case-Sensitive else we had a longer Java program :)");
        Scanner scanner = new Scanner(System.in);
        String searchedValue = scanner.next();
        for (int i = 0; i < stringsArray.length - 1; i++) {
            if (searchedValue.equals(stringsArray[i])) {
                System.out.println("We found :) '" + searchedValue + "' in our string array!");
                return;
            }
        }
        System.out.println("We didn't find '" + searchedValue + "' :(");
    }

    /**
     * Write a Java program to remove a specific element from an array.
     */
    public static void removeASpecificElementFromArray() {
        String[] stringsArray = {"This", "is", "a", "very", "good", "question", "and", "very", "funny"};
        System.out.println("We have the following Strings array: ");
        System.out.println(Arrays.toString(stringsArray) + "\n" +
                "Please insert a number between 1 and " + (stringsArray.length) + ", meaning first '" + stringsArray[0]
                + "' and the last " + "'" + stringsArray[stringsArray.length - 1] + "' element You want to remove?");
        Scanner scanner = new Scanner(System.in);
        int searchedValue = scanner.nextInt();
        if (searchedValue - 1 < 0 || searchedValue > stringsArray.length - 1) {
            System.out.println("Please insert a positive number between 1 and " + (stringsArray.length)
                    + ", meaning first '" + stringsArray[0]
                    + "' and the last " + "'" + stringsArray[stringsArray.length - 1]
                    + "' element You want to remove?");
        }
        for (int i = searchedValue - 1; i < stringsArray.length - 1; i++) {
            stringsArray[i] = stringsArray[i + 1];
        }
        System.out.println("After removing the " + searchedValue + " element, the new array will look like this: "
                + Arrays.toString(stringsArray));
    }

    /**
     * Write a Java program to find the max number (harder: the second max number) in an array of integers.
     */
    public static void theSecondMaxnumberFromIntArray() {
        int[] intArray = {3, 2, 5, 7, -7, 5, 8, -5};

        System.out.println("We have the following array: ");
        System.out.println(Arrays.toString(intArray));
        int max = 0, secondMax = 0; //poate disparea aceasta linie

        /**
         * Testing the array's length
         */
        if (intArray.length < 2) {
            System.out.println("The array's length < 2, max number = Second max number = " + intArray[0]);
            return;
        }
        Arrays.sort(intArray);
        max = intArray[intArray.length - 1];
        for (int i = intArray.length - 2; i >= 0; i--) {
            if (intArray[i] < max) {
                secondMax = intArray[i];
                break;
            }
        }
        System.out.println("The max number is " + max);
        System.out.println("The second max number is : " + secondMax);
    }

    /**
     * Write a Java program to find the duplicate values of an array of string values
     */
    public static void findDuplicatesInStringArray() {
        String[] stringsArray = {"This", "is", "a", "very", "good", "is", "is", "very", "funny", "very"};
        System.out.println("We have the following array: " + Arrays.toString(stringsArray));
        System.out.println("1st result: Duplicates values are: ");
        for (int i = 0; i < stringsArray.length; i++) {
            for (int j = i + 1; j < stringsArray.length; j++) {
                if (stringsArray[i].equals(stringsArray[j])) {
                    System.out.print(stringsArray[i] + " ");
                }
            }
        }//I'm not satisfied with the first one
        //TO DO the second one and show only once every duplicate
        /*
        System.out.println("2nd result: Duplicates values are: ");
        boolean[] stringUniqueValues;
        for (int i = 0; i < stringsArray.length; i++) {
            for (int j = i + 1; j < stringsArray.length; j++) {
                if (stringsArray[i].equals(stringsArray[j])) {
                    stringUniqueValues[i] ++;
                }
            }
        }*/
    }


}
