/*
missing natural [1,2,5,6,9]
o/p: 3 4 7 8
*/
import java.util.*;
class  missingNatural
{
	static int res;
	public static void main(String[] args) 
	{
		int[] a={1,2,5,6,9};
		int n=a[a.length-1];
		System.out.println(Arrays.toString(a));
		miss(a,n);
		
	}
	public static void miss(int []x,int n) {
		for (int i=1;i<=n;i++ )	{
			boolean flag=true;
			for (int j=0;j<x.length;j++ ) {
			  if(x[j]==i) {
				  flag = false;
				  break;
				}
			}
			if (flag) {
				System.out.print(i+"  ");
	    	}
		}
	return;
	}
}
