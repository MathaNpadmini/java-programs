import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
class search
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int c=0,g;
	int[] a1=new int[a];
	int k;
	void input()
	{
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		k=sc.nextInt();
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==k)
			{
				c++;	
			}
		}
		
	}
	void output()
	{
		if(c==0)
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println(Arrays.binarySearch(a1, k));
		}
	}
}
public class sortsearch {

	public static void main(String[] args)
	{
		search obj=new search();
		obj.input();
		obj.output();
		
			
	}
		
		
}
