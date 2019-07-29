import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int cnt = 0;
      for(int i=0;cnt!=n;i++)
        if((i%2)==1)
        {
          System.out.println(i);
          cnt++;
        }
	}
}