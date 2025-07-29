import java.util.Scanner;
class fibonacci
{
	static Scanner  sc = new Scanner (System.in);
	static int n1=0,n2=1,n3;
	public static void main(String[] args) 
	{
		System.out.println("Start ");
		System.out.print("Enter the value : ");
		int number=sc.nextInt();
	    fibo(number);
		System.out.println("End ");
		
	}
	public static void fibo(int n)
	{
	   if (n>=1)
	     {
		   System.out.println(n3+" ");
	   	   n1=n2;
	       n2=n3;
		   n3=n1+n2;
		   n--;
		   fibo(n);
		 }
		 return;
	}
}
