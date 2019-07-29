import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int  sum=0,q=n,rem=0,ttl=1;
      while(q!=0)
      {
        rem=q%10;
        ttl=1;
        q/=10;
        for(int i=rem;i>0;i--)
        {
          ttl*=i;
        }
        sum+=ttl;
      }
      if(sum==n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}