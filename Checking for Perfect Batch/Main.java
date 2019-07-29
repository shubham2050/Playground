import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
    
    int q=n/3;
    int z=-1;
    int sum[]=new int[q];
    
    for(int i=0;i<n;i+=3)
    {
      //for(int j=;j<i+3;j++)
      
        sum[++z]=arr[i]+arr[i+1]+arr[i+2];
      
    }
    int flag=0,cnt=sum[0];
    for(int i=0;i<q;i++)
    {
      if(sum[i]!=cnt)
        flag=1;
    }
    if(flag==1)
      System.out.println("Not a Perfect Batch");
    else
      System.out.println("Perfect Batch");
  }
}