import java.util.Scanner;

public class areaandperiofcircle {

	public static void main(String[] args) 
	{
		double a,c,d;
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		c=3.14*a*a;
		d=2*3.14*a;
		System.out.println(String.format("%.2f", d));
		System.out.println(String.format("%.2f", c));

	}

}
