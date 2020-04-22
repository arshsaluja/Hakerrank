import java.util.*;
class Solution
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int  n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int c=0;
    int co=0;
    for(int i=0;i<n;i++)
    {
         int s=a[i];
         for(int j=i+1;j<n;j++)
            {
                 if(a[j]==s)
                 {
                     c++;
                 }
            }
            if(c%2!=0)
            {
                co++;
            }
            c=0;
    }
    System.out.println(co);
    
}
}
