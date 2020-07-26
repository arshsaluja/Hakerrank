import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String b=sc.next();
         int len=b.length();
        String f="010";
        int l=f.length();
        int t=0;
        int y=0;
        for(int i=0;i<=len-l;)
        {
            String res="";
            for(int j=i;j<i+l;j++)
            {
                char ch=b.charAt(j);
                res=res+ch;
            }
            if(res.equals(f))
            {
            t++;
            i=i+3;
            }
            else
            i++;
        }
        System.out.println(t);
    }
}
