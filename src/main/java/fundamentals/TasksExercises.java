package fundamentals;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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
        System.out.println("The perimeter has the following length: " + diameter * pi);
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

        if ((bmi >= 18.5) && (bmi <= 24.9)) {
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
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }

    }

    public static void fizzBuzz1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer positive number: ");
        int fizzBuzz = scanner.nextInt();
        for (int i = 1; i <= fizzBuzz; i++) {
            if (((i % 3) == 0) && ((i % 7) == 0)) {
                System.out.println("FizzBuzz");
                continue;
            }
            if ((i % 3) == 0) {
                System.out.println("Fizz");
                continue;
            }
            if ((i % 7) == 0) {
                System.out.println("Buzz");
                continue;
            }
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

    public static void printAllPrimeNumbers() {
        System.out.println("Insert an integer positive number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 1) {
            System.out.println("The number is not greater than 1");
            return;         // intr-o metoda void putem folosi return
        } // cand avem return in if nu are rost sa mai punem else in if
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int nr) {
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime1(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                isPrimeNo = false;
                break;   // folositi de fiecare data break daca ati gasit ce va interesa
            }
        }
        return isPrimeNo;
    }

    private static boolean isPrime2(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i != 0) {
                continue;
            }
            isPrimeNo = false;
            break;
        }
        return isPrimeNo;
    }

    private static boolean isPrime3(int nr) {
        if (nr == 2) {
            return true;
        }
        if (nr == 0 || nr == 1 || nr % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= nr; i += 2) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
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
        System.out.println("Inputted texts");
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

    public static void longestWord() {
        System.out.println("Insert a new text ");
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String longestWord = "";
        do {
            word = scanner.next();
            if (longestWord.length() < word.length() && !word.equals("Enough!")) {
                longestWord = word;
            }
        } while (!word.equals("Enough!"));
        if (longestWord.length() == 0) {
            System.out.println("No text provided");
            return;
        }
        System.out.println("The longest word is " + longestWord);
    }

    public static void longestWord1() {
        System.out.println("Insert a new text ");
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String longestWord = "";
        while (!word.equals("Enough!")) {
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
            word = scanner.next();
        }
        if (longestWord.length() == 0) {
            System.out.println("No text provided");
            return;
        }
        System.out.println("The longest word is " + longestWord);
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
        System.out.println("The percentage of occurrences of space character is "
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

    public static void stutteredText1() {
        System.out.println("Insert some text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length-1; i++) {
            System.out.print(words[i] + " " + words[i] + " ");
        }
        System.out.println(words[words.length-1] + " " + words[words.length-1]);
    }

    public static void textString(){
        String s1 = "abc", s2 = "abc", s3 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
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
        do {
            System.out.println("Input one SINGLE character between a .. and .. z");
            secondChar = scanner.next();
            i = secondChar.toLowerCase().charAt(0);
        } while ((secondChar.length() > 1) || (i < 97) || (i > 122));

        i = firstChar.toLowerCase().charAt(0);
        j = secondChar.toLowerCase().charAt(0);
        if (i == j) {
            System.out.println("The same character twice :) - there are 0 characters between");
        } else {
            System.out.println("There are " + (Math.abs(i - j) - 1) + " characters between " +
                    firstChar.toLowerCase().charAt(0) + " and " + secondChar.toLowerCase().charAt(0));
        }
    }

    // Write an application that reads from the user 10 arbitrarily large numbers
    // (variables of type int) and prints those that occurred at least twice.
    public static void largeNumbersCompare() {
        System.out.println("Input 10 integer numbers between numbers from -2,147,483,648 to 2,147,483,647");
        Scanner scanner = new Scanner(System.in);
        int[] intsArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int k = 1;
        do {
            System.out.print("No #" + k + ":");
            intsArray[k - 1] = scanner.nextInt();
            k++;
        } while (k <= 10);

        int[] occurrencesArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (intsArray[i] == intsArray[j]) {
                    occurrencesArray[i]++;
                    occurrencesArray[j] -= 10;
                    counter++;
                } else continue;
            }
        }
        if (counter == 0) {
            System.out.println("There aren't repeating numbers");
        }
        for (int i = 0; i < 10; i++) {
            if (occurrencesArray[i] > 0) {
                System.out.println(intsArray[i] + " has " + (occurrencesArray[i] + 1) + " occurrences");
            }
        }
    }

    //Write an application that takes 10 numbers from the user (type int) and write the length
    // of the longest such subsequence of these numbers, which is increasing.
    // For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5" as the length
    // of the longest increasing subsequence (underlined in the example).
    public static void longestIncreasingSubsequence() {
        System.out.println("Input 10 integer numbers between numbers from -2,147,483,648 to 2,147,483,647");
        Scanner scanner = new Scanner(System.in);
        int[] intsArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int k = 1;
        do {
            System.out.print("No #" + k + ":");
            intsArray[k - 1] = scanner.nextInt();
            k++;
        } while (k <= 10);
        k = 1;
        int longestSubsequence = 0;
        for (int i = 1; i < 9; i++) {
            if (intsArray[i] > intsArray[i - 1]) {
                k++;
                if (k > longestSubsequence) {
                    longestSubsequence = k;
                }
            } else {
                k = 1;
            }
        }
        System.out.println("The longest increasing subsequence has " + longestSubsequence + " numbers");
    }

    // Write an application that will read from the user the date of your next SDA classes and calculate
    // how many days are left to them. Hint: read the date as String and parse it to LocalDate.
    // Get the current date using LocalDate.now() method.
    public static void remainingDays() throws ParseException {
        System.out.println("Insert the date of your next SDA classes in the next format dd/MM/yyyy ");
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.next();

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate classDate = LocalDate.parse(inputDate, dateFormat);
        LocalDate todayDate = LocalDate.now();

        Period period = Period.between(todayDate, classDate);
        System.out.println(period.getDays() + " days until SDA Java classes");
    }

    //Test object from Dog class
    public static void testObject(){
        Dog dog1 = new Dog("Azorel");
    //    dog1.setName("Azorel");

        Dog dog2 = new Dog("Azorel");
    //    dog2.setName("Azorel");

        System.out.println(dog1 == dog2);           // pointeaza catre zone diferite de memorie
        System.out.println(dog1.equals(dog2));      // compara continutul
        System.out.println(dog1.getName()== dog2.getName());
    }
//--------------------------
}// END OF TASKS EXERCISES Class

//Write an application that consists of few classes:
//Author class, representing an author – poem writer, which consists of fields surname and nationality
// (both of type String)
//Poem class, representing poem, which consists of fields creator (type Author) and stropheNumbers
// (type int – numbers of strophes in poem)
//Main class, with main method, inside which you will:
//Create three instances of Poem class, fill them with data (using constructor and/or setters) and store them in array
//Write a surname of an author, that wrote a longest poem (let your application calculate it!)

/////////////////////////

