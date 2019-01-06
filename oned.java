import java.util.Scanner;
public class oned {

	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size :");
		n=sc.nextInt();
		System.out.println("Enter the array elements :");
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("The Maximum Value in the given array is : "+max);
		
	}

}
