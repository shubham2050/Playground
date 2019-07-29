import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner n=new Scanner(System.in);
      int a=n.nextInt();
      
      int x=(a/100);
      int y=(a%10);
      System.out.println(x+y);
	}
}