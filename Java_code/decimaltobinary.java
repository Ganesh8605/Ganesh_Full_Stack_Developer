//WAJP TO CONVERT DECIMAL NUMBER INTO BINARIES
import java.util.Scanner;
class decimaltobinary
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tENTER THE N VALUE : ");
		int number=sc.nextInt();
		String ans="";
		while (number>0)
		{
			ans = number%2+ans;
			number = number/2;
		}
		System.out.println(ans);
	}
}
