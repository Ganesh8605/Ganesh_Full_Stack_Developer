//WAJP to check whether number is happy number or not
import java.util.Scanner;
class happynum
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tENTER THE NUMBER: ");
		int number=sc.nextInt();
		
		while (number!=1&&number!=4)
		{
		int sum=0;
		while (number>0)
		{
			sum=sum+((number%10)*number%10);
		    number=number/10;
		}
		number=sum;
		}
		if (number==1)
		{
			System.out.println("HAPPY NUMBERS");
		}
		else
			System.out.println("un HAPPY NUMBERS");
	}
}
