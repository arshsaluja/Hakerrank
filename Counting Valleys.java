import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int lvl=0;
        int v=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='U')
            lvl++;
            else if(s.charAt(i)=='D')
            lvl--;
            if(lvl==0 && s.charAt(i)=='U')
            v++;
        }
        System.out.println(v);
    }
}
