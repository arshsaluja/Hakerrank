import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int q=sc.nextInt();
        int d1;int d2;
        for(int i=1;i<=q;i++)
        {
            d1=0;d2=0;
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        if(z>x)
         d1=z-x;
        else if(x>z)
         d1=x-z;
        if(z>y)
         d2=z-y;
        else if(y>z)
         d2=y-z;
        if(d1==d2)
        System.out.println("Mouse C");
        else if(d1<d2)
        System.out.println("Cat A");
        else if(d1>d2)
        System.out.println("Cat B");
        }
    }
}
