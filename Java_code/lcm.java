// WAJP TO FIND LCM OF 4 AND 5
/*
multiples of 4:
4,8,12,16,20,24,28,...
multiples of 5:
5,10,15,20,25,....
common multiples : 20,40,60,...
least commomn multiple : 20
*/
import java.util.Scanner;
class lcm
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tENTER A VALUE : ");
		int a=sc.nextInt();
		System.out.print("\t\t\tENTER B VALUE : ");
		int b=sc.nextInt();
	    int ans;
		for (int i=Math.max(a,b);/*if this is empty it can store default value */ ;i++ )
		{
			if (i%a==0 && i%b==0)
			{
				ans=i;
				break;
			}
		}
		System.out.println("THE LCM IS : "+ans);
		
	}
}
