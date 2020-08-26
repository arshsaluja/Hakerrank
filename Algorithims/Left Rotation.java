import java.util.*;
class Solution
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
         a[i]=sc.nextInt();
     }

   while(d!=0)
         {
              int temp=a[0];
             for(int i=0;i<n-1;i++)
             {
         a[i]=a[i+1];
             }
         a[n-1]=temp;
         d--;
         }
     for(int i=0;i<n;i++)
     {
         System.out.print(a[i]+" ");
     }
    }
}
