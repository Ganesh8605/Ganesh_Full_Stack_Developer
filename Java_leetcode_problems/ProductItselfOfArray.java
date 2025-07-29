import java.util.*;
class ProductItselfOfArray 
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4};
		System.out.println("the given array is: "+Arrays.toString(a));
	    int []res=product(a);
		System.out.println("output: "+Arrays.toString(res));
	}
	public static int[] product(int[]a) {
		int []pre=new int[a.length];
		int []suf=new int[a.length];
		
		pre[0]=1;
		suf[a.length-1]=1;
		
		for (int i=1;i<pre.length ;i++ )
		{
			pre[i]=pre[i-1]*a[i-1];
		}
		for (int i=suf.length-2;i>=0 ;i--)
		{
			suf[i]=suf[i+1]*a[i+1];
		}
			int[]res=new int[a.length];
		for (int i=0;i<a.length ;i++ )
		{
			res[i]=pre[i]*suf[i];
		}
			return res;
	}
}
