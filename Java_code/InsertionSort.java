import java.util.*;
class InsertionSort 
{
	public static void Insertion(int[]a) 
	{
		for (int i=1;i<a.length ;i++ )
		{
			int curr=a[i],prev=i-1;
			while (prev>=0 && a[prev]>curr)
			{
				a[prev+1]=a[prev];
				prev--;
			}
			a[prev+1]=curr;
		}
	}
	public static void main(String []args){
		int[]a={7,8,6,3,4};
		System.out.println("before sorting :"+Arrays.toString(a));
		Insertion(a);
		System.out.println("after sorting :"+Arrays.toString(a));
	}
}
