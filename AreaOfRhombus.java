import java.util.Scanner;

public class AreaOfRhombus {

	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		double c;
		c=(a*b)/2;
		System.out.println(Math.round(c));
	}

}
