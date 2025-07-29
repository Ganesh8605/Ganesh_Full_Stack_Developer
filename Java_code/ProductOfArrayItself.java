//product of array itself 
//i/p :[1,2,3,4]`
//o/p :[24, 12, 8, 6]
import java.util.*;
class ProductOfArrayItself
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4};
		System.out.println("The given array is"+Arrays.toString(a));
		int []res=product(a);
		System.out.println("output :"+Arrays.toString(res));
	}
	public static int[] product(int[]a){
		int res[]=new int[a.length];
		for (int i=0,x=0;i<a.length ;i++ ,x++)
		{
			int ans=1;
			for (int j=0;j<a.length ;j++ )
			{
				if (i!=j)
				{
					ans=ans*a[j];
				}
			}
				res[x]=ans;
		}
		return res;
	}
}
