import java.util.*;
class CountingSort
{
	public static void main(String[] args) 
	{
		int []a={8,4,3,8,2};
		System.out.println("The given array :"+Arrays.toString(a));
		sort(a);
		System.out.println("The given array :"+Arrays.toString(a));
	}
	public static void sort(int[]a) {
		int res[]=new int[largest(a)+1]; //[default value of res[]:[0,0,0,0,0,0,0,0,0] ]
		for (int i=0;i<a.length ;i++ )
		{
			res[a[i]]++;    //res[]=[0,0,1,1,1,0,0,0,2]
		}
		for (int i=0,x=0;i<res.length ;i++ )
		{
			while (res[i]>0)//ex :res[2]>0 = 2 > 0
			{                    
				a[x++]=i;    //a[0]=2;
				res[i]--;    //res[i]--  means it moves previous part of res[] not index value. 
			}                 // which means 2 stores 2 times in res array. 
		}
	}
	public static int largest(int[]a) {
		int largest=Integer.MIN_VALUE;
		for (int i=0;i<a.length;i++ )
		{
			largest=Math.max(largest,a[i]);
		}
		return largest;
	}
}
