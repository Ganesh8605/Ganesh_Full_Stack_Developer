// 
import java.util.*;
class Nlargerst
{
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) 
	{
		int[]a={5,6,4,3,7,7,7,8,8,8,10,10,10};
		System.out.print("Enter the n value :");
		int n= sc.nextInt();
		//System.out.println("the "+n+"th Largest value is: "+solve(a,n));
		solve1(a,n);
	}
	public static int solve(int []a,int n) {
		if (n>a.length)
		{
			return -1;
		}
		Arrays.sort(a);
		return a[a.length-n];
	}	
	public static void solve1 (int[]a,int n) {
		Arrays.sort(a);
		int k=1;
		for (int i=a.length-1;i>0 ;i-- )
		{
			if(n>a.length) {
				System.out.println("\t\t\t INVALID...");
				return;
			}
			if(k==n) {
				System.out.println("result :"+a[i]);
				return;
			}
			if (a[i]!=a[i-1])
			{
				k++;
			}
			if (k==n) {
				System.out.println("result :"+a[i-1]);
				return;
			}
			else{
				System.out.println("there is no "+n+" th in array  ")
			}
		}
	}
}