import java.util.Scanner;

class demo
{
	void get1(){
	 Scanner sc= new Scanner(System.in);
	int a[]=new int[100];
	int f[]=new int[100];
    int n,i,j,coun;
   
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
       f[i]=-1;
    }
    
    for(i=0;i<n;i++)
    {
        coun=1;
        for(j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            {
                coun++;
                f[j]=0;
            }
        }
    if(f[i]!=0)
    {
        f[i]=coun;
    }
    }
    System.out.println("The frequency of all elements");
    for(i=0;i<n;i++)
    {
        if(f[i]!=0)

        {
        System.out.println(a[i]+""+"times"+""+f[i]);
        }
    }
}}
public class freq {

	public static void main(String[] args) {
		demo d=new demo();
		d.get1();
	}

}
