package testing.fundamentals;


//Replaces all the spaces in a text with “:”

public class ArrayStringExercises {
    public String changeSpaceInString(String text) {
        String textChanged;
//1.    Apply split on string and concatenate words with ":"
//2.    Iterate over the text string and copy all characters until ' ' and then add ':' in a new string
//3.    Iterate over string and change the string directly
//4.    user Replace
//        System.out.println(text);
//        textChanged = text.replace(' ', ':');
//        System.out.println(textChanged);
//        return textChanged;
        return text.replace(' ', ':');
    }


//Ads in a text, after every “a” letter the length of the text read until then.
//Appends to the end of the text the number of “z” letters found in the text
//Specifies if the array contains elements that fit inside a number interval

    public String insertLengthAfterLetterA(String text) {
        return ""; //Tema
    }

/*    public String appendLength(String text) {
        return text + text.length();
    }*/

    ////Replaces all the even number in an array with their half
    public int[] replaceEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] / 2;
            }
        }
        return array;
    }

    //Finds the position of the min element from the array (if they are multiple elements, the last position, if there aren’t => return -1)
    public int findMinPositionElement(int[] array) {
        //int min = Integer.MAX_VALUE;
        //int [] a = {1, 9999, 110}
        if (array.length == 0) {
            return -1;
        }

        int min = array[0];
        int position = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                position = i;
            }
        }
        return position;
    }

    public String appendLength(String text) {
        return text + text.length();
    }
}
