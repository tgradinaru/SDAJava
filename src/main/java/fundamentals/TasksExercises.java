package fundamentals;

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
            System.out.print(fibo+" ");
        }
        System.out.println("\n" + "the number you are looking for in Fibonacci sequence is " + fibo);
    }


}
