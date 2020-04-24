import java.util.*;
class Electronic
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int b=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k[]=new int[n];
        int d[]=new int[m];
        List <Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            k[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            d[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int sum=k[i]+d[j];
                if(sum<=b)
                {
                     arr.add(sum);
                }
            }
        }
        if(!arr.isEmpty())
        {
            Collections.sort(arr);
            System.out.println(arr.get(arr.size()-1));
        }
        else
        {
        System.out.println("-1");
    }
    }
}
        
