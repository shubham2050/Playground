import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      
      for(int i=1;i<=n;i++)
      {
        int cnt=0;
        for(int j=0;j<n;j++)
        {
          if(arr[j]==i)
            cnt+=1;
        }
        if(cnt==0)
          System.out.println(i);
      }
    }
}