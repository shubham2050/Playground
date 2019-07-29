import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      
      int n=in.nextInt();
      int ttl=1;
      for(int i=n;i>1;i--)
        ttl*=i;
      
      System.out.println(ttl);
	}
}