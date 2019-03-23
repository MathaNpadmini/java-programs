import java.util.Scanner;

public class arraycommomelements {

	public static void main(String[] args)
	{
		int a1,b1;
		Scanner sc = new Scanner(System.in);
		a1=sc.nextInt();
		b1=sc.nextInt();
		int a[]=new int[a1];
		int b[]=new int[b1];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<b.length;j++)
		{
			b[j]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println(a[i]);
				}
			}
		}

	}

}
