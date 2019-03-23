import java.util.Scanner;
import java.lang.Math; 

public class Ioprgms {

	public static void main(String[] args)
	{
		double a;
		double b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		if(a>=0 && a<=1)
		{
			b=a*3.5;
			c=Math.round(b*100.0)/100.0;
			System.out.println(c);
		}
		else if(a>1 && a<=3)
		{
			b=a*5.5;
			c=Math.round(b*100.0)/100.0;
			System.out.println(c);
			

		}
		else if(a>3 && a<=10)
		{
			b=a*8.5;
			c=Math.round(b*100.0)/100.0;
			System.out.println(c);
			
		}
		else
		{
			b=a*10.5;
			c=Math.round(b*100.0)/100.0;
			System.out.println(b);

		}
		sc.close();
	}

	
	}


