import java.util.Scanner;

class sample
{
	double c,x1,x2,y1,y2;
	double distanceBetweenTwoPoints(double lat1, double lon1, double lat2, double lon2)
	{
		x1 = Math.toRadians(lat1);
		y1 = Math.toRadians(lon1);
		x2 = Math.toRadians(lat2);
		y2 = Math.toRadians(lon2);
		c = 6371.01  * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		return c;
	}
}
public class javaMethhods {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		sample s1=new sample();
		double lat1, lon1, lat2, lon2;
		lat1=sc.nextDouble();
		lon1=sc.nextDouble();
		lat2=sc.nextDouble();
		lon2=sc.nextDouble();
		double varName=s1.distanceBetweenTwoPoints(lat1, lon1, lat2, lon2);
		
		System.out.printf("%.2f",varName);
	}

}
