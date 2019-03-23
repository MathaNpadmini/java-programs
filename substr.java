import java.util.Scanner;

public class substr {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		for(int i=0;i<3;i++)
		{
		String s1=str.substring(0,3);
		System.out.print(s1);
		}
	}

}
