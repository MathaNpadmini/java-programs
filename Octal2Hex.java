import java.util.Scanner;

public class Octal2Hex {

	public static void main(String[] args)
	{
		String a,b;
		int q;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		q=Integer.parseInt(a,8);
		b=Integer.toHexString(q);
		System.out.println(b);

	}

}
