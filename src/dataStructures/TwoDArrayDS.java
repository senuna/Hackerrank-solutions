package dataStructures;

import java.util.Scanner;

/**
 * Created by senuna on 26.01.17.
 */
public class TwoDArrayDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        maxHourglassSum(arr);
    }
    static int maxHourglassSum(int arr[][]){
        int sumMax = -100;
        for(int arr_i = 0; arr_i < 4; arr_i++){
            for(int arr_j = 0; arr_j < 4; arr_j++){
                int tempSum =
                        arr[arr_i][arr_j] + arr[arr_i][arr_j+1] + arr[arr_i][arr_j+2] +
                                arr[arr_i+1][arr_j+1] +
                        arr[arr_i+2][arr_j] + arr[arr_i+2][arr_j+1] + arr[arr_i+2][arr_j+2];
                if(tempSum > sumMax){
                    sumMax = tempSum;
                }
            }
        }
        System.out.println(sumMax);
        return sumMax;
    }
}
