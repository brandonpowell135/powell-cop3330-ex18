/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Brandon Powell
 */
/*
Exercise 18 - Temperature Converter

You’ll often need to determine which part of a program is run based on user input or other events.

Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.

The formulas are

C = (F − 32) × 5 / 9
and

F = (C × 9 / 5) + 32

Example Output

Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.

Constraints

Ensure that you allow upper or lowercase values for C and F.
Use as few output statements as possible and avoid repeating output strings.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Break the program into functions that perform the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.
Modify the program so it also supports the Kelvin scale.

 */
import java.util.Scanner;
public class ex18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String str1 = in.nextLine().toUpperCase();

        if (str1.equals("C")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String strF = in.nextLine();
            double F = Double.parseDouble(strF);
            double tempC = (F - 32) * (5 / 9);
            System.out.print("the temperature in Celsius is "+tempC);
        }
        else if (str1.equals("F")){

            System.out.print("Please enter the temperature in Celsius: ");
            String strC = in.nextLine();
            double C = Double.parseDouble(strC);
            double tempF = (C * (5 / 9)) + 32;
            System.out.print("the temperature in Fahrenheit is " + tempF);
        }
        else{
            System.out.print("Invalid Input");
        }


    }
}
