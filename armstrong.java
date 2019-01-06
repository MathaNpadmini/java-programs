import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) 
	{
		int n,s=0,rem;
		Scanner f=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=f.nextInt();
		while (n!=0)
		{
			rem=n/10;
			s=s+(rem*rem*rem);
			n=n/10;
		}
		if(n==s)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not an Armstrong");
		}

	}

}
