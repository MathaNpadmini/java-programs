import java.util.Scanner;

public class matrix2d {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int row,col;
		int i1=0,j1=0;
		row=sc.nextInt();
		col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=j1++;
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}
