import java.util.Scanner;

public class inty2string {
	Scanner sc=new Scanner(System.in);
	static int countt(int n)
	{
		
		int count=0;
		String k=Integer.toString(n);
		char b='4';
		for(int j=0;j<k.length();j++)
		{
			if(k.charAt(j)==b)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		int size;
		inty2string sc1=new inty2string();
		size=sc1.sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc1.sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(countt(a[i]));
		}
		
		

	}

}
