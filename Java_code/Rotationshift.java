import java.util.*;
class Rotationshift  
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		System.out.println("the given array is :"+Arrays.toString(a));
		System.out.print("enter the key value :");
		int n=sc.nextInt();
		shift(a,n);
		System.out.println("the rotational array is"+Arrays.toString(a));
	}
	public static void shift(int[] a,int n) {
		for (int j=1;j<=n ;j++ )
		{
			int last=a[a.length-1];
			for (int i=a.length-2;i>=0 ;i-- )
			{
				a[i+1]=a[i];
			}
			a[0]=last;
		}
		return;
	}
}
