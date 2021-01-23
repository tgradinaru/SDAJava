package fundamentals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Write an application that will read diameter of a circle (variable of type float) and
        //calculate perimeter of given circle.
        //Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter: ");
        float diameter = scanner.nextFloat();
        float pi = (float) Math.PI;
        System.out.println("The perimter has the folowing length: " + diameter*pi);


    }
}
