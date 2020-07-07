import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the superReducedString function below.
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String t="";
        
for(int i=0;i<s.length();i++)
{
    for(int j=i+1;j<s.length();j++)
    {
    if(s.charAt(i)==s.charAt(j))
    {
        i++;
        
    }
    else
   t=t+s.charAt(i);
    
    }
}
if(t.compareTo("")!=0)
        {
    System.out.println(t);
}
else
System.out.println("Empty String");


    }
    }
