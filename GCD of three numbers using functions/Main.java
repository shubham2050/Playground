import java.util.Scanner;
public class Main{
  public static int gcd(int a,int b)
  {
    if(a>b)
    {
      for(int i=b;i>0;i--)
      {
        if(a%i==0)
          return i;
      }
    }else
    {
      for(int i=a;i>0;i--)
      {
        if(b%i==0)
          return i;
      }
    }
    return 0;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int x=in.nextInt();
      int y=in.nextInt();
      int z=in.nextInt();
      int c=gcd(x,y);
      System.out.println(gcd(c,z));
	}
}