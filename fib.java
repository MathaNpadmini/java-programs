import java.util.Scanner;

public class fib {

	public static void main(String[] args)
	{
		int f1=0,f2=1,f4,i;
		Scanner f = new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=f.nextInt();
		for(i=0;i<n;i++)
		{
			if(i<=1)
			{
				f4=i;
				
			}
			
			else
			{
		    
			f4=f1+f2;
			f1=f2;
			f2=f4;
			
			
			}
			
			System.out.println("The value is:"+f4);
		}
		
	}
}
