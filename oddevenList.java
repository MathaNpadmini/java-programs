import java.util.Scanner;

public class oddevenList {

	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}

}
