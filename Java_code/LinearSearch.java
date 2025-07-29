//linear search
import java.util.*;
class LinearSearch
{
	static Scanner sc= new Scanner(System.in); 
	public static boolean search(int []a ,int n){
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]==n)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String [] args) {
		int[]a={7,4,3,1,86,18,21,36,77};
		System.out.println("The given array is :"+Arrays.toString(a));
		System.out.print("Enter the key :");
		int k=sc.nextInt();
		if(search(a,k))
			System.out.println("PRESENT");
		else
			System.out.println("ABSENT");
	}
}
