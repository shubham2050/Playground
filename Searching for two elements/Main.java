import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      
      int arr[]=new int[n];
      int fx=0,fy=0;
      for(int i=0;i<n;i++)
      {
        int inn=in.nextInt();
      	arr[i]=inn;
      }
      
      int x=in.nextInt();
      int y=in.nextInt();
      int x1=0,y1=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]==x)
        {
          fx+=1;
          x1=i;
        }
      }
      for(int i=0;i<n;i++)
      {
        if(arr[i]==y)
        {
          fy+=1;
          y1=i;
        }
      }
      if(fx==0)
        System.out.println("-1");
      else
        System.out.println(x1);
      
      if(fy==0)
        System.out.println("-1");
      else
        System.out.println(y1);
    }
}