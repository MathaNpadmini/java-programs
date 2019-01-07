package arrayreverse;

import java.util.Scanner;

class demo
	{
		int n,i,j,temp;
		int[] a=new int[10];
		void get1()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the array value:");
			n=s.nextInt();
			System.out.println("The array value is:");
			for(i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
			for(i=0;i<n;i++)
			{
				System.out.println("The value before reversing:");
				System.out.println(a[i]);
			}
			j=i-1;
			i=0;
			while(i<j) 
			{
				  temp=a[i];
	              a[i]=a[j];
	              a[j]=temp;
	              i++;
	              j--;
			}
			for(i=0;i<n;i++)
			{
				System.out.println("The reversed value is:"+a[i]);
			}
		}
	}
	 class sample
	{
	public static void main(String[] args)
	{
		demo d=new demo();
		d.get1();
	}

}
 
