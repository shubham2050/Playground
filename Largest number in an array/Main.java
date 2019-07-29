import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      
      int [] arr=new int[n];
      
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      int max=0;
      
      /*int max=0,maxx=0;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(arr[i]>arr[j])
          {
            max=arr[i];
            if(max>maxx)
              maxx=max;
          else
          {
            max=arr[j];
            if(max>maxx)
              maxx=max;
          }
            
        }
      }}
      */
      
      for(int i=0;i<n;i++)
      {
        if(arr[i]>max)
          max=arr[i];
      }
      System.out.println(max);
    }
}