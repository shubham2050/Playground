import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      int cnt=0,j=n-1;
      if(n%2==0)
      {
           for(int i=0;i<(n/2);i++)
      {
        if(arr[i]==arr[--j])
          ++cnt;
      }
       // System.out.println(cnt);
      if(cnt==n/2)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
      
      else
      {
        for(int i=0;i<(n/2)-1;i++)
      {
        if(arr[i]==arr[--j])
          ++cnt;
      }
       // System.out.println(cnt);
      if(cnt==n/2)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
    }
        
      
}