//write a program to check prime num
import java.util.Scanner;
class prime
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tENTER THE NUMBER :");
	    int n=sc.nextInt();
		boolean prime=true;
		if (n==1||n==0)
		{
			prime=false;
		}
		else
		{
			for (int i=2;i<=n/2;i++ )
			{
				if(n%i==0)
				{
					prime=false;
					break;
				}
			}
		}
		if (prime)
		{
			System.out.println(n+"is prime");
		}
		else
			System.out.println(n+" : is not prime");
	}
}
