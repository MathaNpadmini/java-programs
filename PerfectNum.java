import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args)
	{
		int a,sum=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		
			if(sum==a)
			{
				System.out.println("Perfect Number");
			}
			else
			{
				System.out.println("Not Perfect Number");
			}
		}

	}


