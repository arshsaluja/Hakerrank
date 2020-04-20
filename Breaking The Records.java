import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextInt();
        }
        int min=s[0];int max=s[0];int mi=0;
        int ma=0;
        for(int i=1;i<n;i++)
        {
            
            if(s[i]<min)
            {
                min=s[i];
                mi++;
            }

        }
        for(int i=1;i<n;i++)
        {
            
            if(s[i]>max)
            {
                max=s[i];
                ma++;
            }

        }
        System.out.print(ma+" ");
        System.out.print(mi);
    }
}
