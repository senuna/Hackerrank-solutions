package thityDaysOfCode;

import java.util.Scanner;

/**
 * Created by senuna on 22.01.17.
 */
public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/

        int myI = scan.nextInt();
        double myD = scan.nextDouble();
        scan.nextLine();
        String myString = scan.nextLine();

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.println(i + myI);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(d + myD);
        /* Print the sum of the double variables on a new line. */
        System.out.println(s + myString);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        scan.close();
    }
}
