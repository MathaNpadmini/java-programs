import java.util.Scanner;

public class Matrix {

	public static void main(String[] args)
	{
		int b,b1,i;
		
		Scanner sc =new Scanner(System.in);
		b=sc.nextInt();
		b1=sc.nextInt();
		int[][] a=new int[2][b1] ;
		for(i=0;i<2;i++)
			for(int j=0;j<b1;j++)
				a[i][j]=sc.nextInt();
		for (i = 0; i<2; i++)
	      {
	         for (int j = 0; j < b1; j++)
	         {
	            System.out.print(a[i][j]);
	            System.out.print(" ");
	         }
	         System.out.println();
	      }
				
				

	}

}
