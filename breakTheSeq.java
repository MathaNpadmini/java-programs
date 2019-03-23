import java.util.Scanner;



public  class breakTheSeq {
	


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size;
		size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==42)
			{
				System.exit(0);             	
			}
			else 
			{
				System.out.println(a[i]);
			}
		}
		
		
		
		

	}



}
