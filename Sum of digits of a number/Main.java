import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int q = in.nextInt();
      int n=q;
      int a=0;
      int count = 0;
      while(n > 0)
	  {
   	      //System.out.println("Hello");	 
   		a+=n%10;  
        
        n/=10;
  	  }
      
      System.out.println(a);
	}
}