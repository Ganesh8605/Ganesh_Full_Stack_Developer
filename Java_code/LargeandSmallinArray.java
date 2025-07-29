// find the 1st smallest and 1st largest number present in array
// input a=[10,-8,41,-7,52,9]
//output : -8 is 1st minimum
//         52 is 1st maximum
import java.util.Arrays;
class LargeandSmallinArray
{
	static int res;
	public static void main(String[] args) 
	{
		int []a={10,-8,41,-7,52,9};
		System.out.println("The given array is :"+Arrays.toString(a));
		System.out.println("The largest value in array is :"+large(a));
		System.out.println("The smallest value in array is :"+small(a));
	}
	public static int large(int []b)
	{
		int res=b[0];
		for (int i=1;i<b.length ;i++ )
		{
			if (b[i]>res) {
			   res=b[i];
			}
		}
		return res;
	}
	public static int small(int []b)
	{
		int res=b[0];
		for (int i=1;i<b.length ;i++ )
		{
			if (b[i]<res) {
			   res=b[i];
			}
		}
		return res;
	}
}
