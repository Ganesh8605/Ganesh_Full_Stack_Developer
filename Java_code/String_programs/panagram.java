import java.util.*;
class panagram 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the input :");
		String str=sc.nextLine();
		String op=check(str)?"panagram":"not panagram";
		System.out.println(op);
	}
	public static boolean check(String a)
	{
		a=a.toLowerCase();
		boolean [] flag=new boolean[26];
		for (int i=0;i<a.length() ;i++ )
		{
			char ch=a.charAt(i);
			if (ch>='a'&& ch<='z')
			flag[ch-'a']=true;
		}
		for (int i=0;i<26 ;i++ )
		{
			if (flag[i]==false)
				return false;
		}
		return true;
	}
}
