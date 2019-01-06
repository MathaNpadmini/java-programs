import java.util.Scanner;

public class addtionofrows 
{
	public static void main(String mathan[])
	{
		int r,c,i,j,m = 0,n=0;
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
			
			
				for(j=0;j<c;j++)
				{
					n=n+a[0][j];
					
				}
				System.out.println(n);	
				
			
			
			
		}
		
		
	}

