import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      int b,e;
      Scanner in=new Scanner(System.in);
      b=in.nextInt();
      e=in.nextInt();
      int ttl=1;
      for (int i=0;i<e;i++)
      {
        ttl*=b;
      }
      System.out.println(ttl);
    }
}