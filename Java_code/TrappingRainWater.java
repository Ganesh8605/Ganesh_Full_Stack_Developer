// trapping rain water            //leetcode no 42 
import java.util.*;
class TrappingRainWater 
{
	public static void main(String[] args) 
	{
		int []a={4,2,0,3,2,5};
		System.out.println("the given building blocks"+Arrays.toString(a));
		System.out.println("the trapping rain water is :"+trap(a));
	}
	public static int trap(int[]b) {
		int []lm=new int[b.length];
		lm[0]=b[0];
		
		for (int i=1;i<b.length ;i++ )
		{
			lm[i]=Math.max(b[i],lm[i-1]);
		}
		int []rm=new int[b.length];
		rm[b.length-1]=b[b.length-1];
		
		for (int i=b.length-2;i>=0 ;i-- )
		{
			rm[i]=Math.max(b[i],rm[i+1]);
		}
			int sum=0;
		for (int i=0;i<b.length ;i++ )
		{
			sum=sum+(Math.min(lm[i],rm[i]))-b[i];
		}
		return sum;
	}
}
