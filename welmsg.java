import java.util.Scanner;

class Welcome
{
	Scanner sc=new Scanner(System.in);
	String a,b,c;
	public void welcomeMessage()
	{
		a=sc.next();
		b=sc.next();
		c=sc.next();
		if(b.equals("Female"))
		{
			System.out.println("Welcome Ms."+a+"! All the best to get a suitable groom for you");
		}
		else if(b.equals("Male"))
		{
			System.out.println("Welcome Mr."+a+"! All the best to get a suitable life partner for your son or daughter");
		}
	}
}
public class welmsg {

	public static void main(String[] args) 
	{
		Welcome obj=new Welcome();
		obj.welcomeMessage();
	}

}
