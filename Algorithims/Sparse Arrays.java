import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String [n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        int q=sc.nextInt();
        String s[]=new String [q];
        for(int i=0;i<q;i++)
        {
            s[i]=sc.next();
        }
        
        for(int i=0;i<q;i++)
        {
            String d=s[i];
            int c=0;
            for(int j=0;j<n;j++)
            {
                  if(d.equals(str[j]))
                  c++;
            }
            System.out.println(c);
        }
        
    }
}
