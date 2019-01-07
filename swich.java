package vowelusingswitch;
import java.util.Scanner;
public class swich {

	public static void main(String[] args) 
	{
		String s,q;
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");

		s=sc.nextLine();
		int a=0,b=0,c=0,d=0,e=0;
		q=s.toLowerCase();
		r=s.length();
		for(int i=0;i<r;i++)
		{
			char ch=s.charAt(i);
			if(ch=='a')
			{
				a++;
			}
			else if(ch=='e')
			{
				b++;
			}
			else if(ch=='i')
			{
				c++;
			}
			else if(ch=='o')
			{
				d++;
			}
			else if(ch=='u')
			{
				e++;
			}
			
		}
		System.out.println("The count of a is : "+a);
		System.out.println("The count of e is : "+b);
		System.out.println("The count of i is : "+c);
		System.out.println("The count of o is : "+d);
		System.out.println("The count of u is : "+e);

		
	}

}
