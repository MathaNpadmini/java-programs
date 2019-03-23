import java.util.Scanner;

class Average
{
	int a[]=new int[5],sum=0;
	Scanner sc=new Scanner(System.in);
	float avg;
	float per;
	
	public void getMarks()
	{
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void displayPercentage()
	{
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/5;
		per=(avg*100)/100;
		System.out.printf("%.01f",avg);
		System.out.println();
		System.out.println(per+"%");
	}
}
public class avgobj {
	

	public static void main(String[] args) 
	{
		Average obj=new Average();
		obj.getMarks();
		obj.displayPercentage();
			

	}

}
