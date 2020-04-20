import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int ap[]=new int[m];
        int or[]=new int[n];
        int ca=0;
        int co=0;
        for(int i=0;i<m;i++)
        {
            ap[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            or[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
           if((a+ap[i])>=s&&(a+ap[i])<=t)
           {
               ca++;
           }    
        }
        for(int i=0;i<n;i++)
        {
           if((b+or[i])>=s&&(b+or[i])<=t)
           {
               co++;
           }    
        }
        System.out.println(ca);
        System.out.println(co);
    }
}
