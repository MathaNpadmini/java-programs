import java.util.Scanner;

public class FinancialApplication {

	public static void main(String[] args) 
	{
		double a,b,c,d;
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=a*(b/100);
		d=a+c;
		System.out.println("Gratuity="+c);
		System.out.println("Total="+d);

	}

}
