import java.util.Scanner;

class Duplicate
{
	Scanner sc=new Scanner (System.in);
	int size=sc.nextInt();
	int c=0,g;
	int a[]=new int[size];
	void getInput()
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length-1; i++)
        {
			 for (int j = i+1; j < a.length; j++)
            {
                if (a[i] == a[j])
                {
                    g=a[j];
                    
                    c++;
                }
            
            }
        }
	}
	void displayResult()
	{
		if(c==0)
		{
			System.out.println("Not found");
		}
		else 
		{
			 System.out.println(g);
		}
			
	}
}
public class duplicateobj {

	public static void main(String[] args) 
	{
		Duplicate obj=new Duplicate();
		obj.getInput();
		obj.displayResult();
	}

}
