import java.util.Scanner;

public class addtionofrowsandcoloumns 
{
	public static void main(String mathan[])
	{
		int r,c,i,j,n = 0,m=0;
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
			
		for(i=0;i<r;i++)
		{
				for(j=0;j<c;j++)
				{
					n=n+a[i][j];
					
				}
				
				System.out.println("The sum of row "+i+" are : "+n);	
			    n=0;
	}
		for(j=0;j<c;j++)
		{
				for(i=0;i<r;i++)
				{
					m=m+a[i][j];
					
				}
				
				System.out.println("The sum of the coloum "+j+" are : "+m);	
			    m=0;
	}
			
		sc.close();
			
		}
		
		
	}

