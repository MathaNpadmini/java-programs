import java.util.Scanner;
public class twodimensionlmax{

	public static void main(String[] args) 
	{
		int r,c,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size : ");
		r=sc.nextInt();
		System.out.println("Enter the coloumn size : ");
		c=sc.nextInt();
		System.out.println("Enter the array elements : ");
		int a[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
		}
		int max=a[0][0];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				}
			}
			
		}
		System.out.println("The maximum value is : "+max );

	}

}
