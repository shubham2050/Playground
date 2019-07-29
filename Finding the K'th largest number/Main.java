import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      
      int k=in.nextInt();
      Arrays.sort(arr);
      System.out.println(arr[n-k]);
    }   
}