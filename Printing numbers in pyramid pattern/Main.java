import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int z=n;
      int num=0;
      for(int i=1;i<=n;i++)
      {
        
        --z;
        for(int j=0;j<z;j++)
          System.out.print(" ");
        
        for(int j=1;j<=i;j++)
          System.out.print(++num+" ");
        
        System.out.println("");
      }
    }    
}