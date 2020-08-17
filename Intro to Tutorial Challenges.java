import java.util.*;
class Solution
{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
        int v=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==v)
            {
                System.out.println(i);
            }
        }
    }
}
