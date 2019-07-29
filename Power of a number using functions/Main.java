import java.util.Scanner;
class Main
{
  public static int pow(int b,int e)
  {
    int sum=1;
    for(int i=0;i<e;i++)
    {
      sum*=b;
    }
    
    return sum;
  }
  public static void main(String [] args)
  {
    Scanner in=new Scanner(System.in);
    int b=in.nextInt();
    int e=in.nextInt();
    System.out.println(pow(b,e));
  }
}