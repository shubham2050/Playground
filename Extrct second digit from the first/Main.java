import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int q = in.nextInt();
      int n=q;
      int count = 0;
      while(n != 0)
	  {
   	      //System.out.println("Hello");	 
   		n/=10;  
        count = count + 1;
  	  }
      n=q;
      int z=0;
      int a=0;
      if(count==2)
      {
        n%=10;
        a=n;
      }
      while(z<count-2)
      {
        n/=10;
        a=n;
        a%=10;
        z++;
      }
      
      System.out.println(a);
	}
}