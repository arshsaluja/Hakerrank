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
        
        
for(int i=1;i<s.length();i++)
{
    
    if(s.charAt(i)==s.charAt(i-1))
    {
    s=s.substring(0,i-1)+s.substring(i+1);
    i=0;
    }
    }

if(s.length()!=0)
        {
    System.out.println(s);
}
else
System.out.println("Empty String");
    }
    }
