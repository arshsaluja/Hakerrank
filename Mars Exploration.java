import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        int h=l/3;String str="";
        for(int i=0;i<h;i++)
        {
              str=str+"SOS";
        }int count=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)!=str.charAt(i))
            {
              count++;
            }
        }
        System.out.println(count);
    }
}
