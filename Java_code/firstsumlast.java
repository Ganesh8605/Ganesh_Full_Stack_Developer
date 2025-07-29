//WAJP to add first and last digit of the number 
import java.util.Scanner;
class firstsumlast
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tENTER THE NUMBER : ");
		int number=sc.nextInt();
		int last=number%10;
		number=number/10;
		int sum=0;
		while(number>9)
		{
			sum=sum+(number%10);
			number=number/10;
		}
			if (sum==number+last)
			{
				System.out.println("thr given is xylem");
			}
			else
				System.out.println("the given is phloem");
	}
}
