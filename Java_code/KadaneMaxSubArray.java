//wajp to find the maximum sum of subarray elemnts usin kadan approach
//input: num [-2,1,-3,4,-1,2,1,-5,4]
//output :6
//explanation : the sub array [4,-1,2,1] has largest sum 6.
import java.util.*;
class  KadaneMaxSubArray
{
	public static void main(String[] args) 
	{
		int[]a={-2,1,-3,4,-1,2,1,-5,4};
		int res=subarray(a);
		System.out.println("Maximum of sub array :"+res);
	}
	public static int subarray(int []a)
	{
		int n=a.length,sum=0,maximum=Integer.MIN_VALUE;
		for (int i =0;i<n ;i++ )
		{
			sum+=a[i];
			maximum=Math.max(sum,maximum);
			sum=(sum<0)?0:sum;
		}
		return maximum;
	}
}
