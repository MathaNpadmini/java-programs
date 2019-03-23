import java.util.Scanner;

class Square
{
	Scanner sc=new Scanner(System.in);
	int a,b;
	void Area()
	{
		a=sc.nextInt();
		b=a*a;
		System.out.println(b);
	}
}
public class sqobj {

	public static void main(String[] args) 
	{
		Square sq=new Square();
		sq.Area();
	}

}
