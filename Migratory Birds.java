import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int a1=0;int a=0;
        int a2=0;int b=0;
        int a3=0;int c=0;
        int a4=0;int d=0;
        int a5=0;int e=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        switch(arr[i])
        {
            case 1:
                   a1++;
                   a=arr[i];
                   break;
            case 2:
                   a2++;
                   b=arr[i];
                   break;
            case 3:
                  a3++;
                  c=arr[i];
                  break;
            case 4:
                  a4++;
                  d=arr[i];
                  break;
            case 5:
                  a5++;
                  e=arr[i];
                  break;
            default:
                  System.out.println(" ");
                  break;
        }
        }
        if(a1>=a2&&a1>=a3&&a1>=a4&&a1>=a5)
        {
             System.out.println(a);
        }
        else if(a2>=a1&&a2>=a3&&a2>=a4&&a2>=a5)
        {
             System.out.println(b);
        }
        else if(a3>=a1&&a3>=a2&&a3>=a4&&a1>=a5)
        {
             System.out.println(c);
        }
        else if(a4>=a2&&a4>=a3&&a4>=a1&&a4>=a5)
        {
             System.out.println(d);
        }
        else if(a5>=a2&&a5>=a3&&a5>=a4&&a5>=a1)
        {
             System.out.println(e);
        }
      
    }
}
