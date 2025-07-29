import java.util.*;
class BubbleSort
{
	public static void main(String[] args) 
	{
		int[]a={28,26,29,31,8};
		System.out.println("The given array :"+Arrays.toString(a));
		bubble(a);
		System.out.println("The given array :"+Arrays.toString(a));		
	}
	public static void bubble(int[]a) {
		for (int i=0;i<a.length-1 ;i++ )
		{
			for (int j=0;j<a.length-1 ;j++ )
			{
				if (a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
