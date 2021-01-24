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

    //

}
