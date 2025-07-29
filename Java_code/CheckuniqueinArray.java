//if unique element present in array print true.
//[3,4,3,8,4] o/p :true
import java.util.*;
class CheckuniqueinArray
{
	public static void main(String[] args) 
	{
		int[]a={3,4,3,8,4};
		System.out.println("the given array :"+Arrays.toString(a));
		unique(a);
	}
	public static void unique(int []b) {
		for (int i=0;i<b.length ;i++ )
		{
			boolean flag=true;
			for (int j=0;j<b.length ;j++ )
			{
				if (i!=j && b[i]==b[j])
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println(b[i]+"  unique value is present in array so, true");
		}
		return;
	}
}
