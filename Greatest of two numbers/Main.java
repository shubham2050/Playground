import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1=in.nextInt();
      
      if(n>n1)
        System.out.println("num1 is the greatest number");
      else
        System.out.println("num2 is the greatest number");
	}
}