import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int q=sc.nextInt();
        
        for(int i=0;i<q;i++)
        {
            List <String> l=new ArrayList <>();
        List <String> p=new ArrayList <>();
            String s=sc.next();
            String r="";
            for(int j=s.length()-1;j>=1;j--)
            {
                char f=s.charAt(j);
                r=r+f;
                
            }
            r=r+s.charAt(0);
  
            for(int a=1;a<r.length();a++)
            {
                int ch=(int)r.charAt(a-1);
                int c2=(int)r.charAt(a);
                int c=Math.abs(c2-ch);
                p.add(Integer.toString(c));


                int c1=(int)s.charAt(a-1);
                int c3=(int)s.charAt(a);
                int co=Math.abs(c3-c1);
                l.add(Integer.toString(co));

                
            }
            if(l.equals(p))
            {
                System.out.println("Funny");
            }
            else
            {
                System.out.println("Not Funny");
            }
            
        }
    }
}
