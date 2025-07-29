//binary search
import java.util.*;
class BinarySearch
{
	static Scanner sc=new Scanner(System.in);
	public static boolean search(int []a,int n) {
		int l=0,h=a.length-1;
		while(l<=h) {
			int m=(l+h)/2;
			if (n==a[m])
			{
				return true;
			}
			else if (n<a[m])
			{
				h=m-1;
			}
			else if (n>a[m])
			{
				l=m+1;
			}
		}
		return false;
	}
	public static void main(String[]args) {
		int []a={2,8,9,12,13,16,24,15,35,21,7,67};
		Arrays.sort(a);
		System.out.println("The given array :"+Arrays.toString(a));
		System.out.print("Enter the key :");
			int n=sc.nextInt();
		if(search(a,n))
			System.out.println("present");
		else
			System.out.println("absent");
	}
}
