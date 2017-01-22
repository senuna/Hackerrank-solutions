/**
 * Created by senuna on 21.01.17.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        write(N);
    }

    public static void write(int N){
        for (int i = 1; i<=10; i++){
            System.out.println(N+" x "+i+" = "+N*i);
        }
    }
}
