import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ca=0;
        int cb=0;
        int a[]=new int[3];
        int b[]=new int[3];
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<3;j++)
        {
            b[j]=sc.nextInt();
        }
        for(int t=0;t<3;t++)
        {
            if(a[t]>b[t])
            {
                ca++;
            }
            else if(a[t]<b[t])
            {
                cb++;
            }
        }
        System.out.print(ca+" "+cb);
    }
}
//Input
//17 28 30
//99 16 8
//output
//2 1
