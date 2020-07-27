import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();//no of hurdels
        int k= sc.nextInt();//max height dan can jump naturally
        int hr[]=new int[n];
        for(int i=0;i<=(n-1);i++)
        {
        hr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<(n-1);i++)
        {
            if(hr[i]>=max)
            max=hr[i];
        }
        if(max>=k)
        System.out.println(max-k);
        else
        System.out.println("0");
        }
    }
