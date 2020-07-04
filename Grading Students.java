import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int g[]=new int[n];
        for(int i=0;i<n;i++)
        {
             g[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int d=g[i];
            int e=g[i]+1;
            int q=g[i]+2;

            if(g[i]>=38)
            {
                if(d%5==0)
                {
                    System.out.println(d);
                }
                else if(e%5==0)
                {
                    System.out.println(e);
                }
                else if(q%5==0)
                {
                    System.out.println(q);
                }
                else
                {
                    System.out.println(g[i]);
                }

            }
            else
                {
                    System.out.println(g[i]);
                }

        }
    }
}


