import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int t1=0;t1<t;t1++)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int cost[]=new int[n];
            int f=0;
            int l=0;
            for(int k=0;k<n;k++)
            {
                cost[k]=sc.nextInt();
            }
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(cost[i]+cost[j]==m)
                    {
                        f=i+1;
                        l=j+1;
                    }
                }
            }
            System.out.println(f+" "+l);
        }
    }
}
