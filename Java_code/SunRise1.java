//sunrise program
/*The Given Building height :[5, 6, 3, 2, 8, 10, 4]
The number of buildings can see the sun rise :4
*/
import java.util.*;
class SunRise1
{
	public static void main(String[] args) 
	{
		System.out.println("no.of.building" +sun(a));
	}
	public static int sun(int[]a) {
		int count=1;
		int ch=a[0];
		for (int i=1;i<a.length ;i++ )
		{
			if(a[i]>a[i-1]) {
				count++;
				ch=a[i];
			}
		}
		return count;
	}
}
