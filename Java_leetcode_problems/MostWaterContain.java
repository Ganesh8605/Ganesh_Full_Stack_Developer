//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
import java.util.*;
class  MostWaterContain
{
	public static void main(String[] args) 
	{
		int []a={1,8,6,2,5,4,8,3,7};
		System.out.println("Most water container is:"+Arrays.toString(a));
		System.out.println("Most water container is:"+mostwater(a));
	}
	public static int mostwater(int[]a) {
		int left=0,right=a.length-1, maxarea=0;
		while (left<right)
		{
			int area=Math.min(a[left],a[right])*(right-left);
			maxarea=Math.max(area,maxarea);
			if (a[left]>a[right])
			{
				right--;
			}
			else if (a[right]>a[left])
			{
				left++;
			}
			else {
				left++;
				right--;
			}
		}
		return maxarea;
	}
}
