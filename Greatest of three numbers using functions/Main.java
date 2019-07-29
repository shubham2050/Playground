import java.util.Scanner;
class Main{
  public static int n1(int x,int y)
  {
    if(x>y)
      return x;
    else 
      return y;
  }
  public static int n2(int s,int z)
  {
    if(s>z)
      return s;
    else 
      return z;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int x=in.nextInt();
      int y=in.nextInt();
      int z=in.nextInt();
      int c=n1(x,y);
      System.out.println(n2(c,z));
	}
}