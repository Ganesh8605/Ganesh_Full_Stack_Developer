//wajp to merge two arrays in single array
import java.util.Arrays;
class mergingArrays
{
	public static void main(String[] args) 
	{
		int []a={10,20,30,40};
		int []b={50,60,70,80};
		System.out.println("First array"+Arrays.toString(a));
		System.out.println("second"+Arrays.toString(b));
		int []res=merge(a,b);
		System.out.println("merged array"+Arrays.toString(res));
	}
	public static int[] merge(int[]a,int []b)
	{
		int m=0,n=0;
		int[]res = new int[a.length+b.length];
		
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
	return res;	
	}
}
