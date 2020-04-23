import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            int c=0;
            for(int j=0;j<n;j++)
            {
                  a[j]=sc.nextInt();
            }
            for(int y=0;y<n;y++)
            {
                if(a[y]<=0)
                {
                    c++;
                }
            }
            if(c>=k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
    }
}
