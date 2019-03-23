import java.util.Scanner;
class Rotate
{
	void reverseEachWordOfString(String inputstring)
	{
		String[] words = inputstring.split("\\W+");
		for(int i=0;i<words.length;i++)
		{
			String input = words[i]; 
	        StringBuilder input1 = new StringBuilder();
	        input1.append(input); 
	        input1 = input1.reverse();
	        System.out.print(input1+" "); 
		}
	}
}

public class stringtoarrayofwords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Rotate  obj=new Rotate();
		obj.reverseEachWordOfString(s);
		
	}

}
