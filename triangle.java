
import java.io.*;
import java.util.Scanner;
public class triangle {
	 public static void main(String[] args) 
     { 
		int sum=0;
		Scanner sc= new Scanner(System.in);
		int a[]=new int[3];
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
	
     
	
	if(sum==180)
    {
      System.out.println("YES");
    }
	else
    {
      System.out.println("NO");
    }
}
}