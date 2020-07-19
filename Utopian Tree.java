import java.util.*;
class Solution
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    int y=0;int n;
    for(int i=0;i<t;i++)
    {
         n=sc.nextInt();
    y=0;
    for(int j=0;j<=n;j++)
    {
        if(j%2==0)
        y=y+1;
        else
        y=y*2;

    if(j==n)
    System.out.println(y);

}
    }
}
}
