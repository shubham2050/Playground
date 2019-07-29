import java.util.Scanner;
class Main{
  public static void pn(int n)
  {
    for(int i=2;i<n;i++)
    {
      int flag=0;
      for(int j=2;j<n;j++)
      {
        if(i%j==0)
          flag+=1;
      }
      if(flag==1)
        System.out.println(i);
    }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      pn(n);
	}
}