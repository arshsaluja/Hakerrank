import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
     
     long x[]=new long[topic.length*10000];
     int l=0;int max=0;
     for(int i=0;i<topic.length-1;i++)
     {
         for(int j=i+1;j<topic.length;j++)
         {
             String a=topic[i];
             String b=topic[j];
             int m=0;
             for(int k=0;k<a.length();k++)
             {
                 char c1=a.charAt(k);
                 char c2=b.charAt(k);
                 if(c1==c2&& c1=='1')
                 {
                     m++;
                 }
                 else if(c1=='1'&&c2=='0')
                 {
                     m++;
                 }
                 else if(c1=='0'&&c2=='1')
                 {
                     m++;
                 }
             }
             x[l++]=m;
             if(max<m)
             {
                max=m;
             }
         }
     }
     int t=0;
     for(int i=0;i<x.length;i++)
     {
         if(x[i]==max)
         {
             t++;
         }
     }
     int res[]={max,t};
return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
