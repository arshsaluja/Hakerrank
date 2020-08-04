import java.util.*;
import java.util.ArrayList;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w[]=new int[n];
         for(int i=0;i<n;i++)
         {
             w[i]=sc.nextInt();
         }  
     Arrays.sort(w);
     int c=1;
     int a=w[0];
     for(int i=0;i<n;i++)
     {
         if(w[i]>a+4)
         {
             c=c+1;
             a=w[i];
         }
     }
     System.out.println(c);
    }
}
