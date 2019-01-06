package arrrayfact;

import java.util.Scanner;

public class arrayfact {
	static int fact(int i)
	{
		if(i==1)
		{
			return 1;
		}
		else
		{
			return i*fact(i-1);
		}
	}

	public static void main(String[] args) 
	{
		int[] a=new int[10];
		int i,f,n;
		System.out.println("Enter the size of the array:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("The array values are:"+a[i]);
		}
		
		for(i=0;i<n;i++)
		{
			f=fact(a[i]);
			System.out.println("The factorial of each value is:"+f);
		}
		s.close();

	}

}
