import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      int k=in.nextInt();
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      int brr[]=new int[k];
      for(int i=1;i<=k;i++)
      {
        int cnt=0;
        for(int j=0;j<n;j++)
        {
          if(arr[j]==i)
            ++cnt;
        }
        brr[i-1]=cnt;
      }
      for(int i=1;i<=k;i++)
      {
        System.out.println(i+" "+brr[i-1]);
      }
    }
}