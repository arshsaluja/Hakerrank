import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Scanner in = new Scanner(System.in);
    String s = in.next();
    long n = in.nextLong();
    int l=s.length();
    long count=0,count1=0;

    for(int i=0;i<l;i++){
        if(s.charAt(i)=='a')
            count++;
    }
    for(int i=0;i<(n%l);i++){
        if(s.charAt(i)=='a')
            count1++;
    }
    count = count*(n/l)+ count1;
    System.out.println(count);
}
}
