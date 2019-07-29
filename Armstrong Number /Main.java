import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int q=n,rem=1,sum=0,ttl=1;
      int cnt=0;
      while(q!=0)
      {
        q/=10;
        cnt++;
      }
      q=n;
      while(q!=0)
      {
        ttl=1;
        rem=q%10;
        q/=10;
        for(int i=0;i<cnt;i++)
        {
          ttl*=rem;
        }
        sum+=ttl;
      }
      if(sum==n)
        System.out.println("Armstrong Number");
      else 
        System.out.println("Not a Armstrong Number");
          
	}
}