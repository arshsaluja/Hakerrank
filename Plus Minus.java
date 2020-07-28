import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int p=0;int n=0;int z=0;
        int l=arr.length;
   for(int i=0;i<l;i++)
   {
       if(arr[i]>0)
       {p++;}
       else if(arr[i]<0)
       {n++;}
       else
       {z++;}
   }
   double rp=p/(double)l;
   System.out.format("%.6f",rp);
    System.out.println("");
   double rn=n/(double)l;
    System.out.format("%.6f",rn);
     System.out.println("");
   double zp=z/(double)l;
    System.out.format("%.6f",zp);
     System.out.println("");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
