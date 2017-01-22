import java.util.*;
import java.io.*;

/**
 * Created by senuna on 22.01.17.
 */
public class JavaLoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int InputArray[][] = new int[t][3];

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            InputArray[i][0] = a;
            int b = in.nextInt();
            InputArray[i][1] = b;
            int n = in.nextInt();
            InputArray[i][2] = n;
        }
        in.nextLine();
        in.close();

        for(int i = 0; i<t; i++){
            calculate(InputArray[i][0],InputArray[i][1],InputArray[i][2]);
        }
    }


    static void calculate(int a, int b, int n){
        int arr[] = new int[n]; //array for this query

        for (int j = 0; j < n; j++) {
            int temp = a;
            for (int pow = 0; pow <= j; pow++) {
                temp += (int) Math.pow(2, pow) * b;
            }
            arr[j] = temp;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

}
