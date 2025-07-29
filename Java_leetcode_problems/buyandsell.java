// prices = [7,1,5,3,6,4]
// output =5
import java.util.*;
class buyandsell
{
	public static void main(String[] args) 
	{
		int[]a={7,1,5,3,6,4};
		System.out.println(Arrays.toString(a));
		System.out.println("best time to buy and sell: "+stock(a));
	}
	public static int stock(int[]a) {
		int cp=a[0],profit=0,maxprofit=0;
		for (int i=1;i<a.length ;i++ )
		{
			int sp=a[i];
			profit=sp-cp;
			if(profit<0)
				cp=a[i];
			else
				sp=a[i];
			maxprofit=Math.max(profit,maxprofit);
		}
		return maxprofit;
	}
}
