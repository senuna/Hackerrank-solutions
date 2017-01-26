package thirtyDaysOfCode;

import java.util.Scanner;

/**
 * Created by senuna on 26.01.17.
 */
public class Day2Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double tip = (mealCost*((double)tipPercent/100));
        double tax = (mealCost*((double)taxPercent/100));

        // Write your calculation code here.

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tip + tax);

        System.out.println("The total meal cost is "+ totalCost + " dollars.");
    }
}
