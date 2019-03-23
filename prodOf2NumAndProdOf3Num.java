import java.util.Scanner;

public class prodOf2NumAndProdOf3Num{
	static int a,b,c;
	static Scanner sc=new Scanner(System.in);
	
	public  static int productTwo(int a,int b)
	{
		int d;
		d=a*b;
		return d;
	}
	public static int productThree(int a,int b,int c)
	{
		int e;
		e=a*b*c;
		return e;
	}
	

	public static void main(String[] args) 
	{
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();		
		
		prodOf2NumAndProdOf3Num p1=new prodOf2NumAndProdOf3Num();
		System.out.println(p1.productTwo(a, b));
		System.out.println(p1.productThree(a, b, c));

	}
}
	
