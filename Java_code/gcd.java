//WAJP TO FIND G.C.D
/*
step 1-----> Factors of 12 : 1,2,3,4,6,12
step 1-----> Factors of 18 : 1,2,3,6,9,18
common factors : 1,2,3,6
Greatest common divisor : 6
*/
import java.util.Scanner;
class gcd
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tENTER FIRST INTERGER : ");
		int a=sc.nextInt();
		System.out.print("\t\t\tENTER SECOND INTERGER : ");
		int b=sc.nextInt();
		int gcd=1;
		for (int i=1;i<=a && i<=b;i++ )
		{
			if (a%i==0 && b%i==0)
			gcd=i;
		}
		System.out.println("\t\t\tGCD IS : "+gcd);
	}
}
