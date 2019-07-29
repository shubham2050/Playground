import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    
    int i=0;
    int rem=0;
   /* while(i<3)
    {
      a=a%10;
      rem+=a;
      if(i<2)
        rem*=10;
      i++;
    }
    System.out.println(rem);
   /*/
    int b=(a/100);
    int c=(a%100)/10;
    int d=(a%10);
    System.out.println((d*100)+(c*10)+b);
  }
}