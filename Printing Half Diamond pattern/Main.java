import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int z=n;
      for(int i=1;i<=n;i++)
      {
        --z;
        for(int j=0;j<z;j++)
          System.out.print(" ");
        
        for(int j=1;j<=2*i-1;j++)
          System.out.print("*");
        
        System.out.println("");
      }
	}
}