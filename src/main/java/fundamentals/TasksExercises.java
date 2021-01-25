package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class TasksExercises {
    public static final float pi = (float) Math.PI;
    int x = 10;
    static int y = 1;

    // Write an application that will read diameter of a circle (variable of type float) and
    //calculate perimeter of given circle.
    //Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
    public static void circlePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter: ");
        float diameter = scanner.nextFloat();
        System.out.println("The perimeter has the folowing length: " + diameter * pi);
    }

    //Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
    // Your application should read two variables: weight (in kilograms, type float)
    // and height (in centimeters, type int). BMI should be calculated given
    // following formula: weight/height(m)^2 The optimal BMI range is from 18.5 to 24.9,
    // smaller or larger values are non-optimal values. Your program should write "BMI optimal"
    // or "BMI not optimal", according to the assumptions above.
    public static void bodyMassIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your height in cm, e.g. 187 : ");
        int height = scanner.nextInt();
        System.out.println("Insert your weight in Kg, e.g. 96.5: ");
        float weight = scanner.nextFloat();
        float bmi = weight / ((float) height * (float) height / 10000);

        if ((bmi >= 18.5f) && (bmi <= 24.9)) {
            System.out.println(bmi + " BMI optimal");
        } else
            System.out.println(bmi + " BMI not optimal");
    }

    //Write an application that takes a positive number from the user (type int) and writes all numbers
// from 1 to the given number, each on the next line, with the following changes:
//● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
// ● in place of numbers divisible by 7, instead of a number the program should write "Buzz"
// ● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"
    public static void fizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer positive number: ");
        int fizzBuzz = scanner.nextInt();
        for (int i = 1; i <= fizzBuzz; i++) {
            if (((i % 3) == 0) && ((i % 7) == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 3) == 0) {
                System.out.println("Fizz");
            } else if ((i % 7) == 0) {
                System.out.println("Bizz");
            } else
                System.out.println(i);
        }

    }


    //#2 Write an application that takes a positive number from the user (type int) and prints all
    // prime numbers greater than 1 and less than the given number.
    public static void primeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer positive number: ");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            int counter = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //Write an application that will take a positive number from the user (type int) and calculate
    // the Fibonacci number at the indicated index. For example, if the number equals 5, your program
    // should print the fifth Fibonacci number. In Fibonacci sequence,
    // each number is the sum of the two preceding ones.
    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer positive number: ");
        int number = scanner.nextInt();
        int temp1 = 0, temp2 = 1, fibo = 0;
        for (int i = 1; i <= number; i++) {
            fibo = temp1 + temp2;
            temp1 = temp2;
            temp2 = fibo;
            System.out.print(fibo + " ");
        }
        System.out.println("\n" + "the number you are looking for in Fibonacci sequence is " + fibo);
    }

    //Write an application that gets one positive number (type int) from the user and calculates
    // a sum of digits of the given number.
    public static void digitsSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer positive number: ");
        int a = scanner.nextInt();
        int b, sum, temp;
        b = a;
        sum = 0;
        do {
            temp = a % 10;
            sum = sum + temp;
            a = a / 10;
        }
        while (a > 0);
        System.out.println("sum of digits of the given number " + b + " = " + sum);
    }

    //Write an application that will read texts (variables of the String type) until the user
    // gives the text "Enough!" and then writes the longest of the given texts (not including the text "Enough!").
    // If the user does not provide any text, write "No text provided".
    public static void enoughString() {
        Scanner scanner = new Scanner(System.in);
        String currentWord = "";
        String endText = "Enough!";
        //String stringArray[] = {};
        //definesc stringArray-ul - altfel eroare "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0"
        String stringArray[] = {"", "", "", "", "", "", "", "", "", ""};
        int countCharArray[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int counter = 0;
        int maxLength = 0;
        do {
            System.out.println("Insert a new text ");
            currentWord = scanner.nextLine();
            stringArray[counter] = currentWord;
            countCharArray[counter] = currentWord.length();
            counter++;
        } while (currentWord.compareTo(endText) != 0);
        stringArray[counter - 1] = "";
        countCharArray[counter - 1] = 0;
        for (int i = 0; i < counter; i++) {
            if (maxLength <= stringArray[i].length()) {
                maxLength = stringArray[i].length();
            } else {
                continue;
            }
        }
        System.out.println("Inputed texts");
        for (int i = 0; i <= counter; i++) {
            System.out.print(stringArray[i] + " ");
        }
        if (maxLength > 0) {
            System.out.println("\nThe longest word/words is/are: ");
        }
        for (int i = 0; i < counter; i++) {
            if (countCharArray[i] == maxLength) {
                System.out.print(stringArray[i] + " ");
            }
        }
    }

    //Write an application that reads a text from the user (type String)
    // and counts a percentage of occurrences of a space character.
    public static void spaceOccurrences() {
        System.out.println("Insert some text");
        Scanner scanner = new Scanner(System.in);
        String currentLine = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < currentLine.length(); i++) {
            if (currentLine.charAt(i) == ' ') {
                counter++;
            } else continue;
        }
        System.out.println("The percentage of occurences of space character is "
                + ((float) counter * 100 / (float) currentLine.length()) + "%");
    }

    //Write an application that "stutters", that is, reads the user's text (type String),
    // and prints the given text, in which each word is printed twice. For example,
    // for the input: "This is my test" the application should print "This This is is my my test test".
    public static void stutteredText() {
        System.out.println("Insert some text");
        Scanner scanner = new Scanner(System.in);
        String currentLine = scanner.nextLine();
        String temp = "";
        for (int i = 0; i < currentLine.length(); i++) {
            if (currentLine.charAt(i) == ' ') {
                System.out.print(temp + " " + temp + " ");
                temp = "";
            } else {
                temp = temp + currentLine.charAt(i);
            }
        }
        System.out.println(temp + " " + temp);
    }

    // Write an application that reads two lowercase letters of the Latin alphabet (type char) and calculates
    // how many characters is there in the alphabet between given letters. Hint - use the ASCII code table and
    // treat the characters as int numbers.
    public static void charsNumberBetween2letters() {
        System.out.println("Input one character between a .. and .. z");
        Scanner scanner = new Scanner(System.in);

        String firstChar = scanner.next();
        int i = firstChar.toLowerCase().charAt(0);
        do {
            System.out.println("Input one SINGLE character between a .. and .. z");
            firstChar = scanner.next();
            i = firstChar.toLowerCase().charAt(0);
        } while ((firstChar.length() > 1) || (i < 97) || (i > 122));

        System.out.println("Input another character between a .. and .. z");
        String secondChar = scanner.next();
        int j = secondChar.toLowerCase().charAt(0);
        do{
            System.out.println("Input one SINGLE character between a .. and .. z");
            secondChar = scanner.next();
            i = secondChar.toLowerCase().charAt(0);
        } while  ((secondChar.length() > 1) || (i < 97) || (i > 122));

        i = firstChar.toLowerCase().charAt(0);
        j = secondChar.toLowerCase().charAt(0);
        if (i == j) {
            System.out.println("The same character twice :) - there are 0 characters between");
        } else {
            System.out.println("There are " + (Math.abs(i - j) - 1) + " characters between " +
                    firstChar.toLowerCase().charAt(0) + " and " + secondChar.toLowerCase().charAt(0));
        }
    }
//--------------------------
}
