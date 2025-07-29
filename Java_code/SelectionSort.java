import java.util.*;
class SelectionSort
{
	public static void main(String[]args) 
	{
		int[]a={8,1,14,2,4,3,7,-3,-4};
		System.out.println("before sorting...:"+Arrays.toString(a));
		sort(a);
		System.out.println("After sorting...:"+Arrays.toString(a));
	}
	public static void sort(int[]a) {
		for (int i =0;i<a.length ;i++ )
		{
			int s=i;
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[j]<a[s])
				{
					s=j;
				}
			}
			int temp=a[i];
			a[i]=a[s];
			a[s]=temp;
		}
	}
}
