import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
        
        int digit=0;int count=0;
        for(int i=n;i>0;i=i/10)
        {

            digit=i%10;
           
            if(digit!=0)
            {
           if(n%digit==0)
            {
                count++;
            }
            }
        }
      System.out.println(count);
      count=0;
    }
    }
}
