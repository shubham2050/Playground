import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner (System.in);
    
    int n=in.nextInt();
    int a=0;
    for(int i=1;i<=n;i++)
    {
      
      if(a==3)
      {
        System.out.print(",");
        a=0;
      }       
        System.out.print(i);
      a++;
    }
  }
}