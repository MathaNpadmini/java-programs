import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) 
	{
		float a,b;
		double w;
		Scanner sc = new Scanner(System.in);
		a=sc.nextFloat();
		b=sc.nextFloat();
		w=13.12+(0.6215*a)-(11.37*(Math.pow(b,0.16)))+(0.3965*a*Math.pow(b, 0.16));
		System.out.println(Math.round(w*100.0)/100.0);
	}

}
