import java.util.Arrays;
class copyArray
{
	public static void main(String[] args) 
	{
		int []a={10,20,30,40,50};
		System.out.println("a:"+Arrays.toString(a));
		int []x=solve(a);
		System.out.println("x:"+Arrays.toString(x));
	}
	public static int[] solve(int []x) {
		int []res=new int[x.length];
		for (int i=0;i<x.length ;i++ )
		{
			res[i]=x[i];
		}
		return res;
	}
}
