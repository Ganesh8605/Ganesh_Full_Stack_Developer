//input :a1= [1,3] a2=[2] merge [1,3,2]
// output : 2.0
import java.util.*;
class MedianOftwoArrays 
{
	public static void main(String[] args) 
	{
		int[]a={2,2,4,4};
		int[]b={2,2,2,4,4};
		double res=solve(a,b);
		System.out.println(res);
	}
	public static double solve(int[]a,int[]b) {
		int[]res=new int[a.length+b.length];
		int m=0,n=0;
		for (int i=0;i<res.length ;i++ )
		{
			if (m<a.length)
			{
				res[i]=a[m++];
			}
			else if(n<b.length)
			{
				res[i]=b[n++];
			}
		}
		double sum=0;
		for (int i=0;i<res.length ;i++ )
		{
			sum+=res[i];
		}
		double ans =sum/res.length;
		return ans;
	}
}
