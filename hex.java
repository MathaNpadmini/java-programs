import java.util.Scanner;

public class hex {

	public static void main(String[] args) 
	{
		double b,c;
		Scanner sc=new Scanner(System.in);
		
		b=sc.nextFloat();
		c=((b*b)*3*(Math.sqrt(3)))/2;
		System.out.format("%.2f",c);	

	}

}
